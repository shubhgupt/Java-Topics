package Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Shubham Gupta try with resources java 1.7
 */
public class tryWithResources {

    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";
            System.out.println("Enter your name: ");
            str = br.readLine();
            System.out.println("Hello " + str);

        }
    }
}
