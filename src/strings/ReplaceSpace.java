package strings;
/* Space Cost: two char arrays, one for the original string, one for the replaced string.
 * Step 1: count the number of spaces.		  
 * Step 2: According to the result of step 1, create a new arrays for the output string.
 * Step 3: Copy the original string to the new array, one by one. If a space is countered, copy
 * 		   %20 to replace the space char.
 */
public class ReplaceSpace {
	public String solution(String s) {
		int spaceCount = 0, newLength, i;
		int len = s.length();
		char[] s_array = s.toCharArray();
		for(i = 0; i < len; i++) {
			if(s_array[i] == ' ')
				spaceCount++;
		}
		newLength = len + spaceCount * 2;
		char[] str = new char[newLength];
		//str[newLength] = '\0';
		newLength--;
		for(i = len-1; i >= 0; i--) {
			if(s_array[i] == ' ') {
				str[newLength] = '0';
				str[newLength - 1] = '2';
				str[newLength - 2] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength--] = s_array[i];
				//newLength = newLength - 1;
			}
		}
		return new String(str);
	}
	
	public static void main(String[] args) {
		String input = "I am an idolt! What is the matter?";
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.solution(input));
	}
}
