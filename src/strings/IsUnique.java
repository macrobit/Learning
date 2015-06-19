package strings;

public class IsUnique {
	public boolean isUniqueChar(String str) {
		if(str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];
		for(int i=0;i < str.length();i++) {
			int val = str.charAt(i);
			if(char_set[val]==true) 
				return false;
			char_set[val] = true;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		String s = "I am not a fool!";
		IsUnique check = new IsUnique();
		boolean result = check.isUniqueChar(s);
		System.out.println(""+result);
	}
}
