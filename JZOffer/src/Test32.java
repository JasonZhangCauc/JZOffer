import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * 把数组排成最小的数
 * 
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 */
public class Test32 {

	public static class MyComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return Integer.parseInt(o1 + o2) - Integer.parseInt(o2 + o1);
			// return (o1+o2).compareTo(o2+o1);
		}

	}

	public static String PrintMinNumber(int[] numbers) {

		String[] arrays = new String[numbers.length];
		for (int p = 0; p < numbers.length; p++) {
			arrays[p] = numbers[p] + "";
		}
		String string = "";
		Arrays.sort(arrays, new MyComparator());
		for (int k = 0; k < arrays.length; k++) {
			string += arrays[k];
		}
		return string;

	}

	public static void main(String[] args) {
		int array[] = { 11, 56, 89, 15 };
		System.out.println(PrintMinNumber(array));
		int array2[] = { 3, 32, 321 };
		System.out.println(PrintMinNumber(array2));
	}

}
