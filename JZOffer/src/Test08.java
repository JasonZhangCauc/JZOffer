/**
 * 
 * 剑指offer编程题（JAVA实现)——第8题：跳台阶
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 
 *
 */
public class Test08 {
	/**
	 * 
	 * 假设n级台阶，那么第一步就有两种情况，跳一步，跟跳两步。
	 * 情况一：跳一步，那么接下去的就是JumpFloor(target-1);
	 * 情况二：跳两步，那么接下去的就是JumpFloor(target-2)。
	 * 
	 */
    public int JumpFloor(int target) {
		if(target==1) {
			return 1;
		}else if(target==2){
			return 2;
		}
    	return JumpFloor(target-1)+JumpFloor(target-2);

    }
}
