package format;
import java.util.Date;
// "%,d" means format the argument as a decimal integer and insert commas.
public class TestFormat {
	public static void main(String[] args) {
		String s = String.format("I am changing %d into %,d and %c", 10,10,43);
		System.out.println(s);
		// Dates
		String t = String.format("The complete time is %tc.", new Date());
		System.out.println(t);
		String t2 = String.format("The time is %tr.", new Date());
		System.out.println(t2);
		Date today = new Date();
		System.out.println(String.format("%tA, %tB, %td", today,today,today));
		System.out.println(String.format("%tA, %<tB, %<td", today));
		
	}
}
