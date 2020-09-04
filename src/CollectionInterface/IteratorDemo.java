package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add(3);
        c.add("shubh");
        c.add(3.5);
        
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
