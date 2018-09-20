import java.util.Scanner; // Scanner is in the java.util package

public class Page37_2 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // ["input" can be called anything]

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        // ["input" can be called anything]

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);


        // Alternative test 1
        System.out.print("Enter a number for radius 2: ");
        double radius2 = input.nextDouble();
        double area2 = radius2 * radius2 * 3.14159;
        System.out.println("The area for the circle 2 of radius " + radius2 + " is " + area2);


        // Alternative test 2
        System.out.print("Enter three radii: ");
        double radius3_1 = input.nextDouble();
        double radius3_2 = input.nextDouble();
        double radius3_3 = input.nextDouble();

        double area3_1 = radius3_1 * radius3_1 * 3.14159;
        double area3_2 = radius3_2 * radius3_2 * 3.14159;
        double area3_3 = radius3_3 * radius3_3 * 3.14159;

        System.out.println("The area for the circle 3 of radius " + radius3_1 + " is " + area3_1);
        System.out.println("The area for the circle 4 of radius " + radius3_2 + " is " + area3_2);
        System.out.println("The area for the circle 5 of radius " + radius3_3 + " is " + area3_3);


        // Alternative test 3
        double radius4, area4;

        System.out.print("Enter three radii: ");
        radius4 = input.nextDouble();
        area4 = radius4 * radius4 * 3.14159;
        System.out.println("The area for the circle 3 of radius " + radius4 + " is " + area4);
        radius4 = input.nextDouble();
        area4 = radius4 * radius4 * 3.14159;
        System.out.println("The area for the circle 3 of radius " + radius4 + " is " + area4);
        radius4 = input.nextDouble();
        area4 = radius4 * radius4 * 3.14159;
        System.out.println("The area for the circle 3 of radius " + radius4 + " is " + area4);
    }
}