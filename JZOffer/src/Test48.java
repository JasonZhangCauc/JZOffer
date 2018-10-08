/**
 * 
 * 不用加减乘除做加法
 * 
 * 题目描述
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 *
 */
public class Test48 {

	public static void main(String[] args) {
		System.out.println(Add(1, 6));

	}

	public static int Add(int num1, int num2) {

		int a = num1 ^ num2;
		int b = num1 & num2;// 获取进位位
		int c = b << 1;
		if (b != 0) {
			int end = Add(a, c);
			a = end;
		}

		return a;

	}
}
//其他方法
/*
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;
            num2 = (num1&num2)<<1;
            num1 = temp;
        }
        return num1;
    }
*/