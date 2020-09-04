
package CollectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Print_only_Duplicates_in_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Sagar");
        names.add("Sumit");
        names.add("Sumit");
        names.add("Shubham");
        
        Set<String> s = new HashSet<>();
        for(String name : names)
        {
            if(s.add(name)== false)
                System.out.println(name);
        }
    }
    
}
