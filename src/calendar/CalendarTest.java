package calendar;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2015,2,15,11,41);
		System.out.println(c.getTime());
		long day1 = c.getTimeInMillis();
		day1 += 1000*60*60;
		c.setTimeInMillis(day1);
		System.out.println(c.getTime());
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		System.out.println("DATE constant " + c.get(c.DATE)); // DATE is current date.
		c.set(c.DATE, 1);
		System.out.println("set to 1" + c.getTime());
		c.add(Calendar.DATE, 35); // Current date + 35.
		System.out.println("add 35 days " + c.getTime());
		c.roll(c.DATE,35); // 向前循环轮转天
		System.out.println("roll 35 days " + c.getTime());

		
	
	}
}
