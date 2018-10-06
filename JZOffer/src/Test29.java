import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * 最小的K个数
 * 
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 */
public class Test29 {

	ArrayList<Integer> arrayList = new ArrayList<>();

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		if (k > input.length) {
			return arrayList;
		}
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			arrayList.add(input[i]);
		}
		return arrayList;
	}
}
