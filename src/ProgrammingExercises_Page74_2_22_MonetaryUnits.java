import java.util.Scanner;

public class ProgrammingExercises_Page74_2_22_MonetaryUnits {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        // For example, the input 1156 represents 11 dollars and 56 cents.
        System.out.print("Enter the input as an integer whose last two digits represent the cents: ");
        int amount = input.nextInt();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = amount / 100;
        amount = amount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = amount / 25;
        amount = amount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = amount / 10;
        amount = amount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = amount / 5;
        amount = amount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = amount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

        // This works with e.g. 10.03 (entered as 1003)
        // This still doesn't work for amounts with more than 99 cents (e.g. 1234.567 (entered as 1234567))

    }
}