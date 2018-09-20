import java.util.Scanner;

public class ProgrammingExercises_Page72_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double annualInterestRateInPercentage = 5;
        double monthlyInterestRateInDecimal = (annualInterestRateInPercentage / 100) / 12;
        double monthlyInterestIncrease = 1 + monthlyInterestRateInDecimal;

        double accountValue = monthlySaving * monthlyInterestIncrease;
        accountValue = (accountValue + monthlySaving) * monthlyInterestIncrease;
        accountValue = (accountValue + monthlySaving) * monthlyInterestIncrease;
        accountValue = (accountValue + monthlySaving) * monthlyInterestIncrease;
        accountValue = (accountValue + monthlySaving) * monthlyInterestIncrease;
        accountValue = (accountValue + monthlySaving) * monthlyInterestIncrease;

        System.out.println("After the sixth month, the account value is " + accountValue);
    }
}