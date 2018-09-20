import java.util.Scanner;

public class ProgrammingExercises_Page74_2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        // 1200 because you have to divide by 100 to get from percentage to decimal and by 12 to get the monthly rate (100 * 12 = 1200)
        double monthlyInterestRate = annualInterestRate / (1200);

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}