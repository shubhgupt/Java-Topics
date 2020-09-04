
package Exceptions;

public class userDefinedException {
    public static void main(String[] args) {
        int a= 8;
        try{
            if(a<10)
            {
                throw new MyException("error");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{

    public MyException(String message) {
        super(message);
    }
    
}
