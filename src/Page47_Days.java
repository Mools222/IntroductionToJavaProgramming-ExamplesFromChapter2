public class Page47_Days {
    public static void main(String[] args) {

        int daysInAWeek = 7;
        int sunday = 0;
        int monday = 1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;
        int friday = 5;
        int saturday = 6;

        int daysUntilMeet = 10;

        // If today is Saturday, it will be Saturday again in 7 days. Suppose you
        //and your friends are going to meet in 10 days. What day is in 10 days? You can find that the
        //day is Tuesday using the following expression:

        int meetDay = (saturday + daysUntilMeet) % 7;

        System.out.println("If today is Saturday and you and your friends are going to meet in 10 days. What day is in 10 days?");
        System.out.println("Numbered days of the week: Sunday = day 0, Monday = day 1, Tuesday = day 2, Wednesday = day 3, Thursday = day 4, Friday = day 5, Saturday = day 6");
        System.out.println("Meeting day = (6 + 10) % 7");
        System.out.println("Remainder = dividend – quotient * divisor");
        System.out.println("16 divided by 7 results in a quotient of 2. Therefor the remainder is: 16 – 2 * 7 = " + meetDay);
        System.out.println("We will meet on day number " + meetDay + " of the week = Tuesday");
    }
}