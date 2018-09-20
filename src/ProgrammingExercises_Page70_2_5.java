import java.util.Scanner;

public class ProgrammingExercises_Page70_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble(), gratuityRate = input.nextDouble();

        double gratuityRateDecimal = gratuityRate / 100;

        double gratuity = subtotal * gratuityRateDecimal, total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    }
}