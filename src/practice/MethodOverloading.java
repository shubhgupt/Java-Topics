
package practice;

/**
 *Polymorphism
 * Method Overloading
 * 
 */
public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(4);
    }
}
class A // Method overloading, Static binding, Early binding, Compile time Polymorphism
{
    public void show()
    {
        System.out.println("In show 1");
    }
    public void show(int i)
    {
        System.out.println("In show 2");
    }
}