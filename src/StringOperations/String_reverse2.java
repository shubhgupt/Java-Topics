/*
 using standard Java API
 */
package StringOperations;

import java.util.Scanner;

public class String_reverse2 {
    public static void main(String[] args) {
        String original, rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        original = sc.nextLine();
        //for this we require an object of string buffer
        StringBuffer sb = new StringBuffer(original);
        rev = sb.reverse().toString();
        System.out.println("original String is : "+original);
        System.out.println("reversed String is : "+rev);
    }
}
