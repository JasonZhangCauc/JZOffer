/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 * 
 *
 */
public class Test08 {
	/**
	 * 
	 * ����n��̨�ף���ô��һ�����������������һ��������������
	 * ���һ����һ������ô����ȥ�ľ���JumpFloor(target-1);
	 * �����������������ô����ȥ�ľ���JumpFloor(target-2)��
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
