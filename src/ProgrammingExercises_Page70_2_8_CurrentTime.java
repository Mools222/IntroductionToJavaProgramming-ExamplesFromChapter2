import java.util.Scanner;

public class ProgrammingExercises_Page70_2_8_CurrentTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int GMT = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

        System.out.println("Current time is " + (currentHour + GMT) + ":" + currentMinute + ":" + currentSecond + " GMT" + GMT);


    }
}
