package strings;

public class BasicStringCompression {
	public String solution(String str) {
		int size = countCompression(str);
		if(size >= str.length()) {
			return str;
		}
		int counter = 1;
		int len = str.length();
		char[] in_array = str.toCharArray();
		char last = in_array[0];
		StringBuffer out = new StringBuffer();
		for(int i = 1; i < len; i++) {
			if(in_array[i] == last){
				counter++;
			} else {
				out.append(last);
				out.append(counter);
				last = in_array[i];
				counter = 1;
			}			
		}
		out.append(last);
		out.append(counter);
		return out.toString();		
	}
	public int countCompression(String str){
		if(str == null || str.isEmpty()) return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
	// setChar() method is used to put a char and its count into the output array
	public int setChar(char[] array, char last, int index, int count){
		array[index] = last;
		index++;
		char[] ct = String.valueOf(count).toCharArray();
		for(char x : ct){
			array[index++] = x;
		}
		return index;
	}
	public static void main(String[] args) {
		String input = "aaabbbcd";
		BasicStringCompression bsc = new BasicStringCompression();
		System.out.println(bsc.countCompression(input));
		System.out.println(bsc.solution(input));
		System.out.println(bsc.setChar(input.toCharArray(), 'a',0,3));
	}
}
