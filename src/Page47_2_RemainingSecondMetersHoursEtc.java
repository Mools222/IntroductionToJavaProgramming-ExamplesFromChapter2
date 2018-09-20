import java.util.Scanner;

public class Page47_2_RemainingSecondMetersHoursEtc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

        // More

        System.out.print("Enter an integer for meters: ");
        int meters = input.nextInt();

        int kilometers = meters / 1000; // Find minutes in seconds
        int remainingMeters = meters % 1000; // Seconds remaining
        System.out.println(meters + " meters is " + kilometers + " kilometers and " + remainingMeters + " meters");

        // More

        System.out.print("Enter an integer for days: ");
        int days = input.nextInt();

        int weeks = (days / 7);
        int remainingDays = days % 7;

        System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days");

        // More
        System.out.print("Enter an integer for seconds: ");
        int seconds2 = input.nextInt();

        int hours = seconds2 / 3600;
        int remainingMinutes = (seconds2 / 60) % 60;
        int remainingSeconds2 = seconds2 % 60;
        System.out.println(seconds + " seconds is " + hours + " hours and " + remainingMinutes + " minutes and " + remainingSeconds2 + " seconds");



        // All this % stuff only works with integer types (byte, short, int, long) btw, because it truncates the fractions when it divides
        // I probably should have used long to get a longer range of possible numbers you can punch in

    }
}