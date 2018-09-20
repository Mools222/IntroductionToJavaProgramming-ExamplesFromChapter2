import java.util.Scanner;

public class Page63_2_CountingMonetaryUnits_MyVersion2 {
    public static void main(String[] args) {

        int dollarToCents = 100;
        int quaterToCents = 25;
        int dimesToCents = 10;
        int nickelsToCents = 5;
        int penniesToCents = 1;

        Scanner input = new Scanner(System.in);

        // It doesn't work if you type over 99 cents (e.g. 1234.567)
        // Also doesn't work if you type e.g. 10.03

        System.out.print("Enter an amount in dollars & cents (e.g. 1234.56): ");
        double dollarsAndCents = input.nextDouble();

        double totalCents = dollarsAndCents * 100;

        // If 10.03 = This is where a cent is lost
        System.out.println(totalCents);

        int totalDollars = (int)totalCents / 100;

        int remainingCents = (int)totalCents - (totalDollars * 100);

        int totalQuarters = (int)remainingCents / 25;

        remainingCents = remainingCents - (totalQuarters * 25);

        int totalDimes = (int)remainingCents / 10;

        remainingCents = remainingCents - (totalDimes * 10);

        int totalNickels = (int)remainingCents / 5;

        remainingCents = remainingCents - (totalNickels * 5);


        System.out.println(dollarsAndCents + " dollars and cents are equal to: " + totalDollars + " buck, " + totalQuarters + " quarter(s), " + totalDimes + " dime(s), " + totalNickels + " nickel(s) and " + remainingCents + " cent(s).");

    }
}