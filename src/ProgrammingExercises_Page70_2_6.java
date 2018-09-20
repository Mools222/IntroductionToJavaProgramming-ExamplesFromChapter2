import java.util.Scanner;

public class ProgrammingExercises_Page70_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int integer = input.nextInt();

        int getNumberOne = integer % 10;
        int removeNumberOne = integer / 10;

        int getNumberTwo = removeNumberOne % 10;
        int removeNumberTwo = removeNumberOne / 10;

        int getNumberThree = removeNumberTwo % 10;
        int removeNumberThree = removeNumberTwo / 10;

        System.out.println("The sum of the digits is " + (getNumberOne + getNumberTwo + getNumberThree + removeNumberThree));

        // Test
        System.out.println(getNumberOne);
        System.out.println(removeNumberOne);
        System.out.println(getNumberTwo);
        System.out.println(removeNumberTwo);
        System.out.println(getNumberThree);
        System.out.println(removeNumberThree);

    }
}