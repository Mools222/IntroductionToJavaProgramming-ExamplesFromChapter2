import java.util.Scanner;

public class ProgrammingExercises_Page73_2_19_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(), x3 = input.nextDouble(), y3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("The area of the triangle is " + area);

        // Test - reversing the math - has no effect
        double side11 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double side22 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double side33 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        System.out.println(side1);
        System.out.println(side11);

        System.out.println(side2);
        System.out.println(side22);

        System.out.println(side3);
        System.out.println(side33);

        double s2 = (side11 + side22 + side33) / 2;

        double area2 = Math.sqrt(s2 * (s2 - side11) * (s2 - side22) * (s2 - side33));

        System.out.println("The area of the triangle is " + area2);


    }
}