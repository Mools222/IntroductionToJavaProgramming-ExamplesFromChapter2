public class Page54_AugmentedAssignmentOperators {
    public static void main(String[] args) {

        double a = 6.5;
        // a is changed to 6.5 + 6.5 + 1
        // "a += a + 1;" same as "a = a + a + 1;"
        a += a + 1;
        System.out.println(a);
        a = 6;
        // "a /= 2;" same as "a = a / 2;"
        a /= 2;
        System.out.println(a);

        // Test
        double x = 2;
        // "x += 2;" same as "x = x + 2;"
        x += 2; // Statement
        // "x += 2" same as "x = x + 2"
        System.out.println(x += 2); // Expression

    }
}