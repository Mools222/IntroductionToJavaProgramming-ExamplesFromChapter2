import java.util.Scanner;

public class ProgrammingExercises_Page71_2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an airplane’s take-off speed in meters/second (m/s) and acceleration in meters/second squared (m/s2): ");
        double v = input.nextDouble(), a = input.nextDouble();

        double length = Math.pow(v, 2) / (2 * a);

        System.out.println("The minimum runway length for this airplane is " + length);
    }
}