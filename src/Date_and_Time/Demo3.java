
package Date_and_Time;

import java.time.LocalDateTime;
import java.time.Month;


public class Demo3 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        
        System.out.println(dt);
        
        LocalDateTime dt1 = LocalDateTime.of(2000, Month.MARCH, 9, 2, 50, 45);
        System.out.println(dt1);
    }
}
