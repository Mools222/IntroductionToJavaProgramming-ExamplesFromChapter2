import java.util.Scanner;

public class ProgrammingExercises_Page72_2_16_Hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of a hexagon: ");
        double s = input.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(s , 2);

        System.out.println("The area of the hexagon is " + area);

    }
}