/**
 * 
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 *
 */
public class Test13 {
	//Ϊ�˱�֤λ�ã���������ð������ķ�����ÿ��������������
    public void reOrderArray(int [] array) {
    	int length=array.length-1;
        int tmp;
    	for(int i=0;i<length;i++) {
    		for(int j=length;j>i;j--) {
    			tmp=array[j]%2;
    			if(tmp!=array[j-1]%2&&tmp==1) {//�����ں��������
    				tmp=array[j];
    				array[j]=array[j-1];
    				array[j-1]=tmp;
    			}
    		}
    	}
    }
    

}
