import java.util.Scanner;

public class Page63_2_CountingMonetaryUnits_MyVersion1 {
    public static void main(String[] args) {

        int dollarToCents = 100;
        int quaterToCents = 25;
        int dimesToCents = 10;
        int nickelsToCents = 5;
        int penniesToCents = 1;

        Scanner input = new Scanner(System.in);

        // It doesn't work if you type over 99 cents (e.g. 1234.567)
        System.out.print("Enter an amount in dollars & cents (e.g. 1234.56): ");
        double dollarsAndCents = input.nextDouble();

        double totalCents = dollarsAndCents * dollarToCents;

        int totalDollars = (int)totalCents / 100;

        int totalQuarters = (int)totalCents / 25;
        int remainingQuarters = totalQuarters % 25;

        int totalDimes = (int)totalCents / 10;
        int remainingDimes = totalDimes % 10;


        int totalNickels = (int)totalCents / 5;
        int remainingNickels = totalNickels % 5;

        int remainingCents1 = (int)totalCents - ((totalDollars * 100) + (remainingQuarters * 25) + (remainingDimes * 10) + (remainingNickels * 5));
        double remainingCents2 = totalNickels - (totalCents / 5) * 5;

        // This is wrong, because it can't tell when cents are being used for dollars, quarters, dimes and nickles





    }
}