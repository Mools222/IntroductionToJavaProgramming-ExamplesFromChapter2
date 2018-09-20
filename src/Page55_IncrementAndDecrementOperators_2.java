public class Page55_IncrementAndDecrementOperators_2 {
    public static void main(String[] args) {

        int i = 1, j;

        //Increment var by 1, and use the
        //new var value in the statement
        j = ++i;
        // j is 2, i is 2

        System.out.println("j is " + j);
        System.out.println("i is " + i);

        int k = 1, l;

        //Increment var by 1, but use the
        //original var value in the statement
        l = k++;
        // l is 1, k is 2

        System.out.println("l is " + l);
        System.out.println("k is " + k);

        int m = 1, n;

        //Decrement var by 1, and use the
        //new var value in the statement
        n = --m;
        // n is 0, m is 0

        System.out.println("n is " + n);
        System.out.println("m is " + m);

        int o = 1, p;

        //Decrement var by 1, and use the
        //original var value in the statement
        p = o--;
        // p is 1, o is 0

        System.out.println("p is " + p);
        System.out.println("o is " + o);
    }

}

