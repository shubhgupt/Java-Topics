
package Date_and_Time;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class Demo2 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();// Present Time
        System.out.println(t);
        
        LocalTime t1 = LocalTime.of(2,43,3,999);
        System.out.println(t1);
        
        LocalTime t2 = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(t2);
        
        
//      To get all the zone ids
//        for(String s: ZoneId.getAvailableZoneIds())
//        {
//            System.out.println(s);
//        }

        // For machines we use the code below
        Instant i = Instant.now();
        System.out.println(i);
        
    }
}
