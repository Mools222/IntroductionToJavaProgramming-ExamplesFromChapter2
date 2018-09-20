public class Page51_2 {
    public static void main(String[] args) {

        double a = 2, b = 3, c = 4, d = 5, r = 6, t = 7;

        double test1 = 4.0 / 3 * (r + 34) - 9 * (a + b * c) + 3 + d * (2 + a) / a + b * d;

        double test2 = 5.5 * Math.pow((r + 2.5), 2.5 + t);

        System.out.println(test1);
        System.out.println(test2);

        // Confirmed http://www.wolframalpha.com/input/?i=4+%2F+3+*+(6+%2B+34)+-+9+*+(2+%2B+3+*+4)+%2B+3+%2B+5+*+(2+%2B+2)+%2F+2+%2B+3+*+5
        // Confirmed http://www.wolframalpha.com/input/?i=5.5+*+(6+%2B+2.5)%5E(2.5+%2B+7)
    }
}