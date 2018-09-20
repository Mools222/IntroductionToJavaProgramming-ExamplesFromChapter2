import java.util.Scanner;

public class ProgrammingExercises_Page69_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a the radius and length of a cylinder: ");
        double radius = input.nextDouble(), length = input.nextDouble();

        double area = radius * radius * Math.PI, volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}