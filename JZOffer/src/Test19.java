import java.util.ArrayList;

/**
 * 
 * 剑指offer编程题（JAVA实现)——第19题：顺时针打印矩阵
 * 
 * 题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
如果输入如下4 X 4矩阵： 
1  2  3  4 
5  6  7	 8 
9  10 11 12 
13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 */
public class Test19 {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] array2 = { { 1 } };
		int[][] array3 = { { 1 }, { 2 }, { 3 }, { 4 }, { 5 } };
		int[][] array4 = { { 1, 2, 3, 4, 5 } };
		int[][] array5 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		printMatrix(array1);
		System.out.println();
		printMatrix(array2);
		System.out.println();
		printMatrix(array3);
		System.out.println();
		printMatrix(array4);
		System.out.println();
		printMatrix(array5);

	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int x = 0;
		int row = matrix.length;
		int line = matrix[matrix.length - 1].length;
		while (x < row && x < line) {
			arrayList.addAll(printLine(matrix, x, x, row, line));
			x++;
			row--;
			line--;
		}

		System.out.print(arrayList.toString());
		return arrayList;

	}

	private static ArrayList<Integer> printLine(int[][] matrix, int r1, int l1, int r2, int l2) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = l1; i <= l2 - 1; i++) {// 保证奇数层中间可输出
			arrayList.add(matrix[r1][i]);
		}

		for (int k = r1 + 1; k <= r2 - 1; k++) {
			arrayList.add(matrix[k][l2 - 1]);
		}
		if ((r2 - r1) != 1) {//防止重复打印
			for (int j = l2 - 2; j >= l1; j--) {
				arrayList.add(matrix[r2 - 1][j]);
			}
		}

		if ((l2 - l1) != 1) {//防止重复打印
			for (int u = r2 - 2; u > r1; u--) {
				arrayList.add(matrix[u][l1]);
			}
		}

		return arrayList;
	}
}
//其他方法
/**
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int n = array.length,m = array[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(array[i][k]);//左至右
            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//左下至左上
        }
        return result;      
    }
}

*/