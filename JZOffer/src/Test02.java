/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * 
 */
public class Test02 {
	//�˴�Ӧ��������ʽ
	public static String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll("\\s", "%20");
    }
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();;
		str.append("We Are Happy.");
		String str2=replaceSpace(str);
        System.out.println(str2);
    }
}
