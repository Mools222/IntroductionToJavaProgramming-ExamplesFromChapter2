public class Page48_9 {
    public static void main(String[] args) {

        int m = 2, r = 3;

        // https://stackoverflow.com/questions/23326902/why-does-math-powx-y-count-as-a-double
        // As you can see in the documentation, Math.pow() returns a double by design
        // https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#pow(double,%20double)
        // So it automatically gives a floating point result???

        System.out.println(Math.pow((m * r), 2));

        // Just a test

        m = 3;
        r = 4;

        System.out.println(Math.pow((m * r), 2));

        // Another test

        System.out.println(2147483648L + 5);

        // Test 2

        System.out.println(25 / 4.0 + 25 / 4);
        System.out.println(25 / 4.0 + 25 / 4.0);

        // Test 3

        System.out.println(Math.pow(-2, -2));
        System.out.println(Math.pow(-2, 2));
        System.out.println(Math.pow(2, -2));
        System.out.println(Math.pow(2, 2));


    }
}