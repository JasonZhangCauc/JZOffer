/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����
 * �������һ����ת�������ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת,
 * ���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 *
 */
public class Test06 {
    public int minNumberInRotateArray(int [] array) {
		
    	if(array.length==0) {
			return 0;
		}
		
		for(int i=0;i<array.length-1;i++) {//�Ǽ��������ת��һ���ǵݼ���
			if(array[i]>array[i+1]) {
				return array[i+1];
			}
		}
    	return 0;
    }
}
