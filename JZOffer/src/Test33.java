/**
 * 
 * 剑指offer编程题（JAVA实现)——第33题：丑数
 *  
 * 题目描述
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 */
public class Test33 {

	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(5));

	}

	public static int GetUglyNumber_Solution(int index) {
		if (index < 1) {
			return 0;
		}
		int count = 0;
		int[] array = new int[index];
		int a2 = 0;
		int a3 = 0;
		int a5 = 0;
		array[0] = 1;
		int tmp = 0;
		while (count < index - 1) {
			tmp = min(array[a2] * 2, array[a3] * 3, array[a5] * 5);
			if (tmp == array[a2] * 2)
				a2++;
			if (tmp == array[a3] * 3)
				a3++;
			if (tmp == array[a5] * 5)
				a5++;
			array[++count] = tmp;

		}
		return array[index - 1];
	}

	private static int min(int i, int j, int k) {
		if (i <= j && i <= k) {
			return i;
		} else if (j <= k) {
			return j;
		}
		return k;
	}
}
//复杂度较高
/*	public static int GetUglyNumber_Solution(int index) {
		if (index < 1) {
			return 0;
		}
		int[] array = new int[index + 1];
		array[0] = 1;
		if (index == 1) {
			return array[0];
		}
		int count = 1;
		int i = 2;
		while (count <= index - 1) {
			int tmp = i;

			while (i % 2 == 0) {
				i /= 2;
			}
			while (i % 5 == 0) {
				i /= 5;
			}
			while (i % 3 == 0) {
				i /= 3;
			}
			if (i == 1) {
				array[count] = tmp;
				count++;
			}
			i = tmp + 1;
		}

		return array[count - 1];
	}
}*/
