
package practice;

/**
 *
 * @author Shubham Gupta
 * Final Variable, method, Class
 */
public class Final_keyword {
    public static void main(String[] args) {
        final int i;
        i=6;// we cannot change the value of final variable
        System.out.println(i);
    }
}
final class S
{
    final public void show()
    {
        System.out.println("In S show");
    }
    public void show(int a)
    {
        System.out.println("In S show 2");
    }
}
class G //we cannot extend a final class
{
    public void show1() // we cannot override the final method but we can Overload it.
    {
        System.out.println("In G show");
    }
}
