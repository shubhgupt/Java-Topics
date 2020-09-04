package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
// Vector -> Dynamic Array
public class VectorDemo {
    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector();
        v.add(5);
        v.add(4);
        v.add(67);
        v.add(78);
        boolean b = v.removeElement(78);
        v.add(8);
        System.out.println(v.capacity());
        Collections.sort(v);
        for(int i: v)
        {
            System.out.println(i);
        }
//        System.out.println(b);
// Comparision b/w Arraylist and Vector
//      ArraList                Vector
//1.    50%                     100%
//2.    not threadsafe          ThreadSafe theoratically
//3.    fast                    slow
// **ArrayList wins the competition and much better than Vector. Always prefer Arraylist**
    }
    
}
