
package Date_and_Time;

import java.time.LocalDate;
import java.time.Month;

public class Demo1 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); // Today's date
        System.out.println(d);
        
        LocalDate d1 = LocalDate.of(2000, Month.MARCH, 9);
        System.out.println("My birthday "+ d1);
    }
}
