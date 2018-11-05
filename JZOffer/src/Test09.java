/**
 * 
 * 剑指offer编程题（JAVA实现)——第9题：变态跳台阶
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 */
public class Test09 {
	//找规律为1，2，4，8……
    public static int JumpFloorII(int target) {
    	int tmp=1;
    	if(target==1) {
    		return 1;
    	}
        for(int i=1;i<target;i++) {
        	tmp*=2;
        }
        return tmp;
    }
    //测试用
    public static void main(String[] args) {
		System.out.println(JumpFloorII(3));
	}
}
