/**
 * 
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 *
 */
public class Test11 {
	
    public int NumberOf1(int n) {
    	if(n==0){
            return 0;
        }
    	int num=0;
    	while(n!=0) {//�˴�һ��Ҫ��N��=0
    		num++;
    		n=n&(n-1);
    	}
    	return num;
    }
    //������
	public static void main(String[] args) {
		int n=3;
		System.out.println(n&(n-1));
	}

}
