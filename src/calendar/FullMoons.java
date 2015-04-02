package calendar;
import static java.lang.System.out;
import java.util.Calendar;
import java.lang.String;

public class FullMoons {
	static int DAY_IM = 1000*60*60*24;
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2004,0,7,15,40);
		out.println(c.getTime());
		long day1 = c.getTimeInMillis();
		out.println(day1);
		for(int x = 0; x < 60; x++){
			day1 += DAY_IM * 29.52;
			c.setTimeInMillis(day1);
//			String output = String.format("full moon on %ta %<tb %<td %<tT %<tZ %<tY", c.getTime());
			String output = String.format("full moon on %tc", c);
			out.println(output);
		}
	}
}
