/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * 
 */
public class Test09 {
	//�ҹ���Ϊ1��2��4��8����
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
    //������
    public static void main(String[] args) {
		System.out.println(JumpFloorII(3));
	}
}
