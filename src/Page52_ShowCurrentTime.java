public class Page52_ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");


        // Test
        System.out.println(totalMilliseconds);

        double totalMilliseconds2 = System.currentTimeMillis();
        System.out.println(totalMilliseconds2);


        System.out.println("Current time in CEST is: " + (currentHour + 2) + ":" + currentMinute + ":" + currentSecond + " CEST");

        // Test
        // Resultatet kan kun være mellem 0 og 9, for lige så snart man når til 10 bliver det til et sekund / decisekund / centisekund

        long totalDeciseconds = totalMilliseconds / 10;
        long currentDecisecond = totalDeciseconds % 10;

        long totalCentiseconds = totalDeciseconds / 10;
        long currentCentisecond = totalCentiseconds % 10;

        System.out.println(totalDeciseconds);
        System.out.println(currentDecisecond);
        System.out.println(totalCentiseconds);
        System.out.println(currentCentisecond);

        long currentMillis = totalMilliseconds % 10;
        System.out.println(currentMillis);

        System.out.println("Current time in CEST in the format hh:mm:ss:ds:cs:ms is: " + (currentHour + 2) + ":" + currentMinute + ":" + currentSecond + ":" + currentDecisecond + ":" + currentCentisecond + ":" + currentMillis + " CEST");


    }
}