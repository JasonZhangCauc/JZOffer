
/**
 * 
 * 剑指offer编程题（JAVA实现)——第31题：整数中1出现的次数
 * 
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数
 * （从1 到 n 中1出现的次数）。
 *
 */
public class Test31 {

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(5));
		System.out.println(NumberOf1Between1AndN_Solution(13));
		System.out.println(NumberOf1Between1AndN_Solution(0));
		System.out.println(NumberOf1Between1AndN_Solution(-1));
		System.out.println(NumberOf1Between1AndN_Solution(1000));
		System.out.println(NumberOf1Between1AndN_Solution(1));
	}

	public static int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			String tmp = String.valueOf(i);
			char[] array = tmp.toCharArray();
			for (int j = 0; j < array.length; j++) {
				if (array[j] == '1') {
					count++;
				}
			}
		}
		return count;

	}
	/*
	 * 此方法空间不足
	 * public static int NumberOf1Between1AndN_Solution(int n) {
		if (n < 0) {
			return 0;
		}
		int count = 0;
		int m = n;
		if (n == 1) {
			count++;
			return count;
		}
		if (n == 0) {
			return 0;
		}
		while (n >= 1) {
			int tmp = n % 10;
			if (tmp == 1) {
				count++;
			}
			n /= 10;
		}
		count = count + NumberOf1Between1AndN_Solution(m - 1);
		return count;

	}*/
}
