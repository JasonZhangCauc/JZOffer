import java.util.Arrays;

/**
 * 
 * 扑克牌顺子
 * 
 * 题目描述
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
 * 他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 * LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 *
 */
public class Test45 {

	public static void main(String[] args) {
		int[] array = { 0, 2, 3, 4, 5 };
		System.out.println(isContinuous(array));
		int[] array2 = { 0, 1, 3, 4, 5 };
		System.out.println(isContinuous(array2));
		int[] array3 = { 0, 1, 3, 4, 6 };
		System.out.println(isContinuous(array3));
		int[] array4 = {1,3,0,5,0};
		System.out.println(isContinuous(array4));
		int[] array5 = {1,0,0,6,0};
		System.out.println(isContinuous(array5));
		int[] array6 = {0,0,5,0,0};
		System.out.println(isContinuous(array6));

	}

	public static boolean isContinuous(int[] numbers) {
		if (numbers.length != 5) {
			return false;
		}
		int wang = 0;
		for (int i = 0; i < 4; i++) {// 非0重复则一定不能组成顺子 0,1,2,3
			if (numbers[i] != 0) {
				for (int j = i + 1; j < 5; j++) {
					if (numbers[i] == numbers[j]) {// 非0重复则一定不能组成顺子
						return false;
					}
				}
			} else {
				wang = wang + 1;
			}
		}
		if (numbers[4] == 0) {// 最后一个数判断大小王
			wang = wang + 1;
		}
		Arrays.sort(numbers);
		if (wang == 0) {
			if (numbers[4] - numbers[0] == 4) {
				return true;
			} else {
				return false;
			}
		}
		if (wang == 1) {
			if ((numbers[4] - numbers[1] == 3) || (numbers[4] - numbers[1] == 4)) {
				return true;
			} else {
				return false;
			}
		}
		if (wang == 2) {
			if ((numbers[4] - numbers[2] == 3) || (numbers[4] - numbers[2] == 4) || (numbers[4] - numbers[2] == 2)) {
				return true;
			} else {
				return false;
			}
		}
		if (wang == 3) {
			if ((numbers[4] - numbers[3] == 3) || (numbers[4] - numbers[3] == 4) || (numbers[4] - numbers[3] == 2)
					|| (numbers[4] - numbers[3] == 1)) {
				return true;
			} else {
				return false;
			}
		}
		if (wang == 4) {
			return true;
		}
		return false;

	}
}
