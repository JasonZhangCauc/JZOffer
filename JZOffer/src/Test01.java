/**
 * 
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Test01 {
	
	public static boolean Find(int target, int[][] array) {
		for (int i = (array.length - 1); i >= 0; i--) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target)
					return true;
				if (array[i][j] > target)
					break;
			}
		}
		return false;
	}
	//测试
	public static void main(String[] args) {
		int target=5;
		int [][]array= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(Find(target,array));
	}

}
