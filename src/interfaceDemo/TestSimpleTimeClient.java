package interfaceDemo;

public class TestSimpleTimeClient {
    public static void main(String... args) {
        SimpleTimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in California: " +
            myTimeClient.getZonedDateTime("Blah blah").toString());
        TimeClient.print();
    }
}
