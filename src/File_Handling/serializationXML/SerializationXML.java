
package File_Handling.serializationXML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializationXML {
    public static void main(String[] args) {
        try {
            Student st1 = new Student();
            st1.setSname("Shubham");
            st1.setSroll(101);
            
            Student st2 = new Student();
            st2.setSroll(102);
            st2.setSname("Adarsh");
            
            List<Student> s = new ArrayList<>();
            s.add(st1);
            s.add(st2);
            
            College c = new College();
            c.setStudents(s);
            
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializationXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
