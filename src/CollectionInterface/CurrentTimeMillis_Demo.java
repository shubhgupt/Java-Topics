
package CollectionInterface;

import java.util.ArrayList;


public class CurrentTimeMillis_Demo {
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis(); // This method returns the no. of milliseconds from 1 Jan 1970.
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            a.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    
}
