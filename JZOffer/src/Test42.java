import java.util.ArrayList;

/**
 * 
 * 和为S的两个数字
 * 
 * 题目描述
	输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
	如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述:
	对应每个测试案例，输出两个数，小的先输出。
 *
 */
public class Test42 {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5,6,9};
		ArrayList<Integer> arrayList = FindNumbersWithSum(array,9);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
	}

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			if (array[i] + array[j] == sum) {
				arrayList.add(array[i]);
				arrayList.add(array[j]);
				return arrayList;
			}
			if (array[i] + array[j] > sum) {
				j--;
			} else {
				i++;
			}
		}
		return arrayList;
    }
}
