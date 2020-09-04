package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;

public class List_Interface {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(3);
        l.add(7);
        l.add(38);
        
        l.add(2,78);
        l.remove(3);
        
        Collections.sort(l);
        l.forEach(System.out::println);
//        Iterator i = l.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
//       
    }
    
}
