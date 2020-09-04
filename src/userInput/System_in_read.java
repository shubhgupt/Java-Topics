
package userInput;

public class System_in_read {
    public static void main(String[] args) throws Exception
    {
        int i= System.in.read();// It takes input only from 0 - 255 and returns the ASCII code of that value
        System.out.println(i);
    }
}



