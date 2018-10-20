
/**
 * 
 * 剑指offer编程题（JAVA实现)——第34题：第一次只出现一次的字符
 * 
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 *
 */
public class Test34 {

	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("dsaasdsddwwq"));
	}

	public static int FirstNotRepeatingChar(String str) {
		char[] arrays = str.toCharArray();
		for (int i = 0; i < arrays.length; i++) {
			if (!str.substring(str.indexOf(arrays[i] + "") + 1, str.length()).contains(arrays[i] + "")) {
				// System.out.println(arrays[i]);
				return i;
			}
			if (i == arrays.length - 1) {
				return -1;
			}
		}
		return -1;
	}
}
