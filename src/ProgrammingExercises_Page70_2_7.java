import java.util.Scanner;

public class ProgrammingExercises_Page70_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextInt();

        double years = minutes / 60 / 24 / 365;

        double days = (years - (int)years) * 365;

        System.out.println((int)minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days");

        // OK let's try with %

        double days2 = minutes / 60 / 24;
        double remainingDays = days % 365;

        double years2 = days2 / 365;

        System.out.println((int)minutes + " minutes is approximately " + (int)years2 + " years and " + (int)remainingDays + " days");




    }
}