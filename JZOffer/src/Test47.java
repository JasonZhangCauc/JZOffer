/**
 * 
 * 求1+2+3+...+n
 * 
 * 题目描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字
 * 及条件判断语句（A?B:C）。
 *
 */
public class Test47 {
	public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}

	public static int Sum_Solution(int n) {
		if (n == 0) {
			return 0;
		}
		return n + Sum_Solution(n - 1);
	}
}
