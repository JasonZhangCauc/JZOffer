import java.util.ArrayList;

/**
 * 
 * 数组中只出现一次的数字
 * 
 * 题目描述
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class Test40 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 5, 6 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(array, num1, num2);
	}

	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		ArrayList<String> arrayList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (arrayList.contains(array[i] + "")) {
				arrayList.remove(array[i] + "");
			} else {
				arrayList.add(array[i] + "");
			}
		}
		num1[0] = Integer.parseInt(arrayList.get(0));
		num2[0] = Integer.parseInt(arrayList.get(1));
		// System.out.println(num1[0]+""+num2[0]);
	}
}
