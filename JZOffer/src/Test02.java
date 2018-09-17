/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 */
public class Test02 {
	//此处应用正则表达式
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
