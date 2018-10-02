/**
 * 
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 */
public class Test11 {
	
    public int NumberOf1(int n) {
    	if(n==0){
            return 0;
        }
    	int num=0;
    	while(n!=0) {//此处一定要是N！=0
    		num++;
    		n=n&(n-1);
    	}
    	return num;
    }
    //测试用
	public static void main(String[] args) {
		int n=3;
		System.out.println(n&(n-1));
	}

}
