
package practice;

/**
 *In interface also we can define a method using default keyword.
 *
 */
public class InterfaceDemo3 {
    public static void main(String[] args) {
        w obj= new w();
        obj.show();
        P.show();
    }
}
interface J
{
    default void show()
    {
        System.out.println("You are in Interface J");
    }
}
interface P
{
    static void show()
    {
        System.out.println("You are in Interface P");
    }
    
}
class w implements J
{
//    public void show()
//    {
//        System.out.println("You are inside class w");
//    }
}