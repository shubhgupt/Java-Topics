
package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//when we show laziness and don't want to handle the exception then we can use throws to supress the error.
public class throwsKeyword {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Hello "+str);
    }
}
