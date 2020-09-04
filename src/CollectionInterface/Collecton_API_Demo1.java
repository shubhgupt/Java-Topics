
package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collecton_API_Demo1 {
    public static void main(String[] args) {
/*       Collection c = new ArrayList();  this collection by default supports all types of object to
         make it specific we have to use generics.*/
        Collection<Integer> c = new ArrayList();
        
        c.add(1);
        c.add(2);
        c.add(5);
        
        c.remove(2);
        for(Object o: c){
            System.out.println(o);
        }
    }
    
}
