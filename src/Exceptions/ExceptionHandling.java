
package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i, j=5,k=0;
        int a[] = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=47;
        try
        {
            System.out.println("Enter a number:");
            j= Integer.parseInt(br.readLine());
            k=i/j; //unchecked exception 
//            for (int l = 0; l < 5; l++) {
//                a[l]= l;
//            }
//            for(int value: a)
//            {
//                System.out.println(value);
//            }
            System.out.println(k);
            
        }
        catch(IOException ie) //checked Exception
        {
            System.out.println("Some input error has came");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("cannot divide by zero");
        }
//        catch(ArrayIndexOutOfBoundsException ab)
//        {
//            System.out.println("maximum index you can use is 3");
//        }
        //It is a good practice to use a catch with Exception class at the end to catch any unknown exception
        catch(Exception e)
        {
            System.out.println("Some unknown Exception is found");
        }
        finally
        {
            System.out.println("BYE");
        }
    }
    
}
