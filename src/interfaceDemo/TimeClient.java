package interfaceDemo;
import java.time.*;

public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    
    static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString +
                "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }	
    
    static void print() {
    	System.out.println("Static method test!!!");
    }
    
	default ZonedDateTime getZonedDateTime(String zoneString) {
		return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	}
}
