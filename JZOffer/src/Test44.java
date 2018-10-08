/**
 * 
 * 翻转单词顺序列
 * 
 * 题目描述
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，
 * 你能帮助他么？
 *
 */
public class Test44 {

	public static void main(String[] args) {
		String teString = "student. a am I";
		System.out.println(ReverseSentence(teString));
		String teString2 = "";
		System.out.println(ReverseSentence(teString2));
		String teString3 = " ";
		System.out.println(ReverseSentence(teString3));
	}

	public static String ReverseSentence(String str) {
		if (str == null) {
			return null;
		}
		if (str.trim().equals("")) {//这句很重要
			return str;
		}
		String tmp = "";
		String[] arrays = str.split("\\s");
		int length = arrays.length;
		for (int i = length - 1; i >= 0; i--) {
			tmp = tmp + arrays[i] + " ";
		}
		return tmp.substring(0, tmp.length() - 1);
	}
}
