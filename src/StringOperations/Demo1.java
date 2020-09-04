
package StringOperations;

import java.util.Scanner;

/**
 *
 * @author S
 */
public class Demo1 {
    public static void main(String[] args) {
        
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        
        int l1 = s1.length();
        int l2 = s2.length();
         
        System.out.println("The length of the two strings is: "+ l1 +" and "+ l2);
        
        String s3 = s1.concat(s2); // s1 + s2;
        System.out.println("Concatenation result: "+ s3);
        
        s1 = s1.toUpperCase();
        System.out.println("First string in uppercase: "+ s1);
    }
    
}
