package CollectionInterface;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Entry_Interface_Demo {
    public static void main(String[] args) {
        Map<String,String> phonebook = new Hashtable<>();
        phonebook.put("Shubham", "9109071454");
        phonebook.put("Pawan", "9826748376");
        phonebook.put("Pankaj", "6788994433");
        phonebook.put("Monam", "9867547786");
        phonebook.put("Sonam", "7697123876");
        
        Set<Map.Entry<String,String>> values = phonebook.entrySet();
        for(Map.Entry<String,String> e : values)
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
