
package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_class {
    public static void main(String[] args) throws IOException
    {
        String str= "";
        int i= 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        i = Integer.parseInt(br.readLine());
        System.out.println("Hello "+ str+i);
    }
}
