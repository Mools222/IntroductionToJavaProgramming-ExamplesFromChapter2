public class Page65 {
    public static void main(String[] args) {

        int value = 2147483647 + 1;
        // value will actually be -2147483648

        System.out.println(value);

        // Next page

        int value2 = -2147483648 - 1;
        // value will actually be 2147483647

        System.out.println(value2);
    }
}