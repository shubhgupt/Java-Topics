package CollectionInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface_Demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //we can also use Hashtable if thread safety is required
        map.put("name","Shubham Gupta");
        map.put("language","Java");
        map.put("actor","Hrithik Roshan");
        map.put("actor","Rock"); // it will change the previous data stored.
        
        Set<String> keys = map.keySet();
        for(String key: keys)
            System.out.println(key + "  " + map.get(key));
    }
    
}
