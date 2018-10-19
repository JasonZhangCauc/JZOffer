import java.util.Arrays;

/**
 * 
 * 剑指offer编程题（JAVA实现)——第28题：数组中出现次数超过一半的数字
 * 
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 *
 */
public class Test28 {

	public static void main(String[] args) {
		int []array1 = null;
		MoreThanHalfNum_Solution(array1);
		int []array2 = {};
		MoreThanHalfNum_Solution(array2);
		int []array3 = {1,2,3,4,5,6,7,8,9};
		MoreThanHalfNum_Solution(array3);
		int []array4 = {4,4,4,4,4,4,4};
		MoreThanHalfNum_Solution(array4);
		int []array5 = {1,1,5,6,8,7,1,1};
		MoreThanHalfNum_Solution(array5);

	}

	public static  int MoreThanHalfNum_Solution(int[] array) {
		if(array==null||array.length==0) {
    		return 0;
    	}
		int length = array.length;
		int count = 0;
		Arrays.sort(array);//排序后较大的数必在中间
		int num = array[length / 2];
		for (int i = 0; i < length; i++) {
			if (num == array[i])
				count++;
		}
		if (count <= (length / 2)) {//出现次数不超过一半
			num = 0;
		}
		return num;
	}
}
