package CollectionInterface;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_Demo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();
        System.out.println(values.add(87));
        System.out.println(values.add(67));
        System.out.println(values.add(98));
        System.out.println(values.add(45));
        System.out.println(values.add(67));
        
        for(int i: values)
        {
            System.out.println(i);
        }
    }
    
}
