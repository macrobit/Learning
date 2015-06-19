package strings;
import java.lang.StringBuffer;
public class BufferTest {
	public String joinWords(String[] words) {
		StringBuffer sentence = new StringBuffer();
		for(String w : words) {
			sentence.append(w);
		}
		return sentence.toString();
	}
	
	public static void main(String[] args){
		String[] s = {"I ", "am ", "an ", "idiom"};
		BufferTest test = new BufferTest();
		System.out.println(test.joinWords(s));
		String t = String.valueOf(108);
		System.out.println("The number is " + t);
	}
}
