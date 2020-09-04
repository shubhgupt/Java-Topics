package CollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class Double_Braces_Initialization {
    public static void main(String[] args) {
        
//        List<Integer> values = Arrays.asList(78,87,98); it is a one way of initialization when we know the elements of list.
        
        List<Integer> values = new ArrayList<Integer>()
        {{
           add(87);
           add(35);
           add(54);
        }};
        // In Double Braces Initialization the outer brace is anonymous inner class and the inner one is Instanciation Initializers
        for(int i: values)
            System.out.println(i);
    }
    
}
