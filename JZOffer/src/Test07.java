
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
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
