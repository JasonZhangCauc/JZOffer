
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * 
 *
 */
public class Test10 {
	/**
	 * 
	 * ����Ȱ�һ�飬��ô����ȥ�ľ���RectCover(target-1);
	 * ����Ȱ����飬��ô����ȥ�ľ���RectCover(target-2)��
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
    //����
	public static void main(String[] args) {
		System.out.println(RectCover(4));
	}

}
