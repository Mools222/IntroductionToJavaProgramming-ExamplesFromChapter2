import java.util.Scanner;

public class ProgrammingExercises_Page71_2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        double a = 312032486;                       // US population
        double b = 365 * 24 * 60 * 60;              // Seconds in 365 days
        double c = 7.0;                             // Births/second
        double d = 13.0;                            // Deaths/second
        double e = 45.0;                            // Immigrants/second
        double f = (b / c) - (b / d) + (b / e);     // Population increase/year

        System.out.println("The population in " + years + " is " + (int)(a + f * years));

    }
}