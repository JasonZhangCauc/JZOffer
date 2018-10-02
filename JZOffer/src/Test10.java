
/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 
 *
 */
public class Test10 {
	/**
	 * 
	 * 如果先摆一块，那么接下去的就是RectCover(target-1);
	 * 如果先摆两块，那么接下去的就是RectCover(target-2)。
	 */
    public static int RectCover(int target) {
    	if (target==0) {
			return 0;
		}else if(target==1) {
			return 1;
		}else if(target==2){
			return 2;
		}
    	return RectCover(target-1)+RectCover(target-2);
    }
    //测试
	public static void main(String[] args) {
		System.out.println(RectCover(4));
	}

}
