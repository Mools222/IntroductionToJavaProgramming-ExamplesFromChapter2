import java.util.Scanner;

public class ProgrammingExercises_Page72_2_14_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double poundsToKg = weight * 0.45359237;
        double inchesToMeters = height * 0.0254;

        double BMI = poundsToKg / Math.pow(inchesToMeters, 2);

        System.out.println("BMI is " + BMI);

    }
}