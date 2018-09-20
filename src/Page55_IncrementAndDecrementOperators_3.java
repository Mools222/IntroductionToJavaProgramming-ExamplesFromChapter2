public class Page55_IncrementAndDecrementOperators_3 {
    public static void main(String[] args) {

        int i = 10;
        int newNum = 10 * i++;
        System.out.println("i is " + i + ", newNum is " + newNum);
        // My comment: This adds 1 to i, making it 11, but since it's postincrement, the original value (i = 10) is used in the statement (newNum = 10 * 10)
        // Book: In this case, i is incremented by 1, then the old value of i is used in the multiplication. So newNum becomes 100.

        // Same as
        int i2 = 10;
        int newNum2 = 10 * i2;
        i2 = i2 + 1;
        System.out.println("i2 is " + i2 + ", newNum2 is " + newNum2);

        // Preincrement
        int i3 = 10;
        int newNum3 = 10 * ++i3;
        System.out.println("i3 is " + i3 + ", newNum3 is " + newNum3);
        // i is incremented by 1, and the new value of i is used in the multiplication. Thus newNum becomes 110.

        // Same as
        int i4 = 10;
        i4 = i4 + 1;
        int newNum4 = 10 * i;
        System.out.println("i4 is " + i4 + ", newNum2 is " + newNum4);

        // More from the same page

        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);
        System.out.println("x is " + x + ", y is " + y + " and z is " + z);


    }
}