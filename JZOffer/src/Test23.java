/**
 * 
 * 剑指offer编程题（JAVA实现)——第23题：二叉搜索树的后序遍历序列
 * 
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 */
public class Test23 {
	public static void main(String[] args) {
		int[] sequence = { 3, 7, 6, 9, 11, 10, 8 };
		System.out.println(VerifySquenceOfBST(sequence));
		int[] sequence2 = { 3, 7, 6 };
		System.out.println(VerifySquenceOfBST(sequence2));
		int[] sequence3 = { 3 };
		System.out.println(VerifySquenceOfBST(sequence3));
		int[] sequence4 = { 7, 4, 6, 5 };
		System.out.println(VerifySquenceOfBST(sequence4));
	}

	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0) {
			return false;
		}
		if (sequence.length == 1) {
			return true;
		}
		return isPos(sequence, 0, sequence.length - 1);
	}

	private static boolean isPos(int[] sequence, int start, int end) {
		if (start >= end) {
			return true;
		}
		int i = end;
		for (; i >= start; i--) {// 找到第一个比尾数小的下标
			if (sequence[end] > sequence[i]) {
				break;
			}
		}
		for (int j = 0; j <= i - 1; j++) {// 找到的数前面的数都应该比尾数小
			if (sequence[j] > sequence[end]) {
				return false;
			}
		}
		return isPos(sequence, start, i) && isPos(sequence, i + 1, end - 1);
	}

}
