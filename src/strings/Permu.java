package strings;

public class Permu {
	public static String sort(String s) {

		char[] content = s./*toLowerCase().*/toCharArray();
		java.util.Arrays.sort(content); // sort() method also consider case!!!
		System.out.println(content);
		return new String(content);
	}

	public static boolean permutation(String s, String t) {
		if (s.length() != t.length())
		return false;
		//return sort(s).equalsIgnoreCase(sort(t)); //case insensative
		return sort(s).equals(sort(t));
	}
	
	public static boolean permut(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] letter = new int[256];
		char[] chars = s.toCharArray();
		for(char c : chars) {
			letter[c]++;
		}
		for(int i = 0; i < t.length(); i++) {
			int c = t.charAt(i);
			if(--letter[c] < 0) return false;
		}
		return true;

	}

	public static void main(String[] args) {  
		String s1 = "Dog";
		String s2 = "dog";	
		String s3 = "aaaaaabbbbb";
		String s4 = "aaaabbbbbbb";
		boolean result = permutation(s1,s2);
		System.out.println("The result is " + result + " !");
		System.out.println(permut(s3,s4));
	}
}
