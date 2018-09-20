import java.util.Scanner;

public class Page61_ComputeLoan_MyVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate (e.g. 5%), the number of years, and the loan amount: ");
        double annualInterestRate = input.nextDouble(), numberOfYears = input.nextDouble(), loanAmount = input.nextDouble();

        // Dividing by 100 converts % to decimal
        // Dividing by 12 convert from yearly to monthly interest rate
        double monthlyInterestRate = annualInterestRate / (100 * 12);

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow((1 + monthlyInterestRate), numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is: " + monthlyPayment);
        System.out.println("The total payment is: " + totalPayment);

        // Things I didn't do
        // Use appropriate data types
        // Remove decimals by converting to integer and back to float with casting

        // Stuff
        System.out.println("The total interest payment is: " + (totalPayment - loanAmount));

    }
}