/*
there are two ways to reverse a string in java
1. By customized logic
2. Using standard Java API
*/
package StringOperations;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        //1. Using out own logic
        String original,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        original = sc.nextLine();
        int length = original.length();
        
        for (int i = length-1; i >= 0; i--) {
            rev = rev + original.charAt(i);
        }
        System.out.println("Original String is : "+ original);
        System.out.println("Rverse of string is : "+ rev );
    }
}
