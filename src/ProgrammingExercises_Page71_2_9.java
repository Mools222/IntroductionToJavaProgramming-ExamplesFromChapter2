import java.util.Scanner;

public class ProgrammingExercises_Page71_2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds: ");
        double v0 = input.nextDouble(), v1 = input.nextDouble(), t = input.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.println("The average acceleration is " + acceleration);

    }
}