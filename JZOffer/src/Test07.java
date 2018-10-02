
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * 1 1 2 3 5 8
 */
public class Test07 {
	
    public int Fibonacci(int n) {
    	int []array=new int[40];
    	array[0]=0;
    	array[1]=1;
    	array[2]=1;
    	if(n==0) {
    		return 0;
    	}else if (n==1||n==2) {
			return 1;
		}
    	for(int i=3;i<=n;i++) {
    		array[i]=array[i-1]+array[i-2];
    	}
    	return array[n];
    }

}
