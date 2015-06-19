package format;
import java.util.Date;
// "%,d" means format the argument as a decimal integer and insert commas.
public class TestFormat {
	public static void main(String[] args) {
		/*%c is a char, the corresponding argument is the a ascii code*/
		String s = String.format("I am changing %d into %,d and %c", 10,10,43);
		System.out.println(s);
		System.out.printf("%-10.3f\n", 3.1415); //flag -
		System.out.printf("%10.3f\n", 3.1415); //width + precision
		System.out.printf("%+d and %d \n", 10, -10); //flag +
		System.out.printf("%0 10d\n", -3); //flag space
		System.out.printf("%,8d\n", 1000000000);
		System.out.printf("%.10s \n", "There area lot of winners in the world, why cannot I become one of them?");
		// Dates
//		String t = String.format("The complete time is %tc.", new Date());
		System.out.printf("The complete time is %tc.\n", new Date());
//		String t2 = String.format("The time is %tr.", new Date());
		System.out.printf("The time is %tr. \n", new Date());
		Date today = new Date();
//		System.out.println(String.format("%tA, %tB, %td", today,today,today));
		System.out.printf("%tA, %tB, %td \n", today,today,today);
//		System.out.println(String.format("%tA, %<tB, %<td", today));
		System.out.printf("%tA, %<tB, %<td \n", today);
		
	}
}
