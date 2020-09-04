
package practice;

public class Abstract_class {
    public static void main(String[] args) {
        MaheshPhone obj = new SureshPhone(); 
        obj.cook();
    }
}
abstract class MaheshPhone // abstract class
{
    public void call()
    {
        System.out.println("Calling....");
    }
    public abstract void move();  //abstract method
    public abstract void dance();
    public abstract void cook();
}
abstract class RameshPhone extends MaheshPhone  // abstract class
{
    public void move()
    {
        System.out.println("Moving....");
    }
    public void dance()
    {
        System.out.println("Dancing....");
    }
    
}
class SureshPhone extends RameshPhone  // Concrete class
{
    public void cook()
    {
        System.out.println("Cooking....");
    }
}