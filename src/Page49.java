public class Page49 {
    public static void main(String[] args) {

        // Binary integer literal

        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535

        // Test (fra 0 til 15, dvs. 16 muligheder i alt)
        System.out.println(0B0000); // Viser 0 (0 + 0 + 0 + 0)

        System.out.println(0B0001); // Viser 0 (1 + 0 + 0 + 0)

        System.out.println(0B1000); // Viser 08 (0 + 0 + 0 + 8)

        System.out.println(0B1111); // Viser 15 (1 + 2 + 4 + 8)

        // Octal integer literal

        System.out.println(07777);

        // Hexadecimal integer literal

        System.out.println(0XFFFF);
    }
}
