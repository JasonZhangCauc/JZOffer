import java.util.Stack;

/**
 * 
 * 栈的压入、弹出序列
 * 
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 
 * 
 */
public class Test21 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 4, 5, 3, 2, 1 };
		int[] c = { 4, 3, 5, 1, 2 };
		int[] d = { 3, 5, 4, 2, 1 };
		System.out.println(IsPopOrder(a, b));
		System.out.println(IsPopOrder(a, c));
		System.out.println(IsPopOrder(a, d));
	}

	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int m = 0, n = 0;
		stack.push(pushA[m++]);// 先入栈一个元素
		while (n < popA.length ) {// 遍历popA中的元素，若满足条件则符合题目要求
			while (popA[n] != stack.peek()) {// 模拟入栈，栈顶元素不是要找的则依次将pushA中元素入栈
				if (m == pushA.length) {
					return false;
				} // 元素均入栈后依次弹栈，若弹栈顺序不与popA相同则顺序错误
				stack.push(pushA[m++]);
			}
			n++;// 判断下一个
			stack.pop();// 弹栈
		}
		return true;

	}
}
