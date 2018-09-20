public class Page63_1 {
    public static void main(String[] args) {

        double b = 80;
        double a = 15;
        double c = 22;

        double d = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        double d1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c));
        double d11 = Math.pow(b, 2) - 4 * a * c;
        double d12 = Math.sqrt(d11);
        double d2 = 2 * a;

        System.out.println(d);

        System.out.println(d1);
        System.out.println(d11);
        System.out.println(d12);
        System.out.println(d2);

        // It didn't work at first, because you can't take the square root of a negative


    }
}