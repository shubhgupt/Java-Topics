
package userInput;

import java.util.Scanner;


public class ScannerClass {
    public static void main(String[] args) {
        
        String str = "";
        int i = 0;
        Scanner sc =new Scanner(System.in);
        str = sc.nextLine();
        i = sc.nextInt();
        System.out.println("Hello "+str+i);
    }
}
