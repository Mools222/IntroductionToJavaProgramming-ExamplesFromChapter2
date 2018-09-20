public class Page48_2_NumericDataTypeRanges {
    public static void main(String[] args) {

        byte storageSizeOfByteInBits = 8;
        short storageSizeOfShortInBits = 16;
        int storageSizeOfIntInBits = 32;
        long storageSizeOfLongInBits = 64;
        float storageSizeOfFloatInBits = 32;
        double storageSizeOfDoubleInBits = 64;

        // Why -2^x and 2^x?
        // Mathematically: n bits yields 2n patterns (2 to the nth power)

        // Why 2^x-1?
        // Because 0 is part of the positive range, so it's 128 characters in total???

        // As you can see in the documentation [https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#pow%28double,%20double%29], Math.pow() returns a double by design
        // So I'll have to use a cast, unless I want to use double for all the calculations

        byte byteNegativeRange = (byte) Math.pow(-2, (storageSizeOfByteInBits - 1));
        byte bytePositiveRange = (byte) (Math.pow(2, (storageSizeOfByteInBits - 1)) - 1);

        short shortNegativeRange = (short) Math.pow(-2, (storageSizeOfShortInBits- 1));
        short shortPositiveRange = (short) (Math.pow(2, (storageSizeOfByteInBits - 1)) - 1);

        int intNegativeRange = (int) Math.pow(-2, (storageSizeOfIntInBits));
        int intPositiveRange = (int) (Math.pow(2, (storageSizeOfIntInBits - 1)) - 1);

        long longNegativeRange = (long) Math.pow(-2, (storageSizeOfLongInBits));
        long longPositiveRange = (long) (Math.pow(2, (storageSizeOfLongInBits - 1)) - 1);

        float floatNegativeRange1 = (float) (-3.4028235 * (Math.pow(10, 38)));
        float floatNegativeRange2 = (float) (-1.4 * (Math.pow(10, -45)));

        float floatPositiveRange1  = (float) (1.4 * (Math.pow(10, -45)));
        float floatPositiveRange2 = (float) (3.4028235 * (Math.pow(10, 38)));

        // For some reason it wont display the correct result of (-4.9 * (Math.pow(10, -324)) or (4.9 * (Math.pow(10, -324))
        // It still doesn't work if you write -4.94065645841246544176568792868221372365059802614324  / 4.94065645841246544176568792868221372365059802614324
        // You can use -2^-1074 instead / 2^-1074
        // Or maybe not, because both -2^-1074 and 2^-1074 = 4.9E-324
        // The end of the "double" negative range is supposed to be -4.9E-324
        // wolframalpha gives the correct results
        // http://www.wolframalpha.com/input/?i=-2%5E-1074
        // http://www.wolframalpha.com/input/?i=2%5E-1074

        double doubleNegativeRange1 = (-1.7976931348623157 * (Math.pow(10, 308)));
        double doubleNegativeRange2 = (-4.9 * (Math.pow(10, -324)));

        double doubleNegativeRange2_1 = (Math.pow(-2, -1074));

        double doublePositiveRange1  = (4.9 * (Math.pow(10, -324)));
        double doublePositiveRange2 = (1.7976931348623157 * (Math.pow(10, 308)));

        double doublePositiveRange1_1 = (Math.pow(2, -1074));

        System.out.println("The range of a byte is " + byteNegativeRange + " to " + bytePositiveRange);
        System.out.println("The range of a short is " + shortNegativeRange + " to " + shortPositiveRange);
        System.out.println("The range of an int is " + intNegativeRange + " to " + intPositiveRange);
        System.out.println("The range of a long is " + longNegativeRange + " to " + longPositiveRange);
        System.out.println("The negative range of a float is " + floatNegativeRange1 + " to " + floatNegativeRange2);
        System.out.println("The positive range of a float is " + floatPositiveRange1 + " to " + floatPositiveRange2);

        System.out.println("The negative range of a double is " + doubleNegativeRange1 + " to " + doubleNegativeRange2);
        System.out.println("The positive range of a double is " + doublePositiveRange1 + " to " + doublePositiveRange2);

        System.out.println("The negative range of a double is " + doubleNegativeRange1 + " to " + doubleNegativeRange2_1);
        System.out.println("The positive range of a double is " + doublePositiveRange1_1 + " to " + doublePositiveRange2);

        // Test
        System.out.println(Math.pow(2, 1074));
        System.out.println(Math.pow(-2, 1074));
        System.out.println(Math.pow(2, -1074));
        System.out.println(Math.pow(-2, -1074));

        // Test
        double doubleNegativeRange2_2 = (1 / (Math.pow(-2, -1074)));
        System.out.println(doubleNegativeRange2_2);





    }
}