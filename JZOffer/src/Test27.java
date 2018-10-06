import java.util.ArrayList;
import java.util.Collections;


/**
 * 
 * 字符串的排列
 * 
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 *
 */
public class Test27 {
	public static void main(String[] args) {
		System.out.println(Permutation("abc").toString());
	}

	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<>();
		if (str.length() > 0) {
			PermutationHelper(str.toCharArray(), 0, list);
		}
		Collections.sort(list);// 按字典序排序
		return list;
	}

	private static void PermutationHelper(char[] charArray, int i, ArrayList<String> list) {
		if (i == charArray.length - 1) {
			if (!list.contains(String.valueOf(charArray))) {
				list.add(String.valueOf(charArray));
			}

		} else {
			for (int j = i; j < charArray.length; j++) {
				swap(charArray, i, j);
				PermutationHelper(charArray, i + 1, list);
				swap(charArray, i, j);// 复原
			}
		}

	}

	private static void swap(char[] charArray, int i, int j) {
		char tmp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = tmp;

	}

}