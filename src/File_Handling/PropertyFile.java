
package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile
{
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();
        File f = new File("data_config.txt");
        OutputStream fout = new FileOutputStream(f);
        
        p.setProperty("url","localhost:3303/mydb");
        p.setProperty("uname", "Shubham");
        p.setProperty("pass", "8976");
        p.store(fout, null);
        
        InputStream fin = new FileInputStream(f);
        //load() method loads all the data of file in the p object.
        p.load(fin);
        System.out.println(p.getProperty("pass"));
        
        p.list(System.out);
    }
}
