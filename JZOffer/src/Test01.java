/**
 * 
 * 二维数组中的查找
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
