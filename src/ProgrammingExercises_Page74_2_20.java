import java.util.Scanner;

public class ProgrammingExercises_Page74_2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble(), annualInterestRate = input.nextDouble();

        // 1200 because you have to divide by 100 to get from percentage to decimal and by 12 to get the monthly rate (100 * 12 = 1200)
        double interest = balance * (annualInterestRate / 1200);

        System.out.println("The interest is " + interest);
    }
}