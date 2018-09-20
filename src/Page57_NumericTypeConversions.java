public class Page57_NumericTypeConversions {
    public static void main(String[] args) {

        System.out.println((int)1.7);

        System.out.println((double)1 / 2);
        System.out.println(1 / 2);

        // Test
        System.out.println(1.0 / 2);

        // More from page 57

        int sum = 0;
        sum += 4.5; // sum becomes 4 after this statement

        System.out.println(sum);

        int sum2 = 0;
        sum2 = (int)(sum2 + 4.5); // sum += 4.5 is equivalent to sum = (int)(sum + 4.5).

        System.out.println(sum2);



    }
}