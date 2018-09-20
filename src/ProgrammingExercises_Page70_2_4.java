import java.util.Scanner;

public class ProgrammingExercises_Page70_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double lbs = input.nextDouble();

        double kgs = lbs * 0.454;
        System.out.println(lbs + " pounds is " + kgs + "kilograms");

    }
}