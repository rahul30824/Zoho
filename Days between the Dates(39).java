import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public static long daysBetween(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Create LocalDate objects for both dates
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

        // Calculate the number of days between the two dates
        return ChronoUnit.DAYS.between(date1, date2);
    }

    public static void main(String[] args) {
        int d1 = 10, m1 = 2, y1 = 2014;
        int d2 = 10, m2 = 3, y2 = 2015;
        
        // Call the function and print the result
        System.out.println(daysBetween(d1, m1, y1, d2, m2, y2));
    }
}
