
package File_Handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Demo1 {
    public static void main(String[] args) throws Exception
    {
        File f = new File("demo.txt");
        //we can also pass the file name or path in FileOutputStream also but it is a good practice to 
        // use the file object because if we want to make changes in file name then it will be easy 
        // to format only at one place 
        FileOutputStream fout = new FileOutputStream(f);
        //DataOutputStream Class requires the object of FileOutputStream class to create an object
        DataOutputStream dout = new DataOutputStream(fout);
        //UTF is basically a format in which we want to write the data in our file.
        dout.writeUTF("Shubham Gupta");
        dout.writeUTF("Java Developer");
        
        
        FileInputStream fin = new FileInputStream(f);
        //DataInputStream Class requires the object of FileInputStream class to create an object
        DataInputStream din = new DataInputStream(fin);
        //readUTF method only fetch the amount of data which is written by the one writeUTF method in
        //the file
        String str = din.readUTF();
        String str1 = din.readUTF();
        System.out.println(str+"\n" +str1);
    }
}
