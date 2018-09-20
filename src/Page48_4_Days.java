import java.util.Scanner;

public class Page48_4_Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int daysInAWeek = 7;
        int sunday = 0;
        int monday = 1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;
        int friday = 5;
        int saturday = 6;

        System.out.print("Enter which day of the week it is + How many days from now you want to know the day of the week: ");
        int today = input.nextInt(), daysInFuture = input.nextInt();

        int weekdayInFuture = (today + daysInFuture) % 7;

        System.out.println("If today is day number " + today + " of the week, then it'll be day number " + weekdayInFuture + " of the week in " + daysInFuture + " days");
    }
}