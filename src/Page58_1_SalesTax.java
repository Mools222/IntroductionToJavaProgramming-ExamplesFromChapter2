 import java.util.Scanner;

public class Page58_1_SalesTax {
    public static void main(String[] args) {
        // The program in Listing 2.8 displays the sales tax with two digits after the decimal point.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
        // It takes the tax (11.853 in the example) and multiplies it by 100 (making it 1185.3)
        // Then it changes the data type of that multiplied number (1185.3) from a double into an int, thus removing all decimals (making it 1185 in the example)
        // Then it divides that number by 100.0 ((making it 11.85) - Note that 100.0 is a floating-point value, so the decimals aren't lost
        // Java automatically converts the integer (1185) to a floating-point value when it is divided with the floating-point value (100.0) (Chapter 2.15, page 56)


        //Test
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100);
        // 100 is an integer, so the result in the example will be 11, because the fractional part is truncated

    }
}