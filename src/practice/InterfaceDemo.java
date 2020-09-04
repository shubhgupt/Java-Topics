
package practice;

public class InterfaceDemo {
    public static void main(String[] args) {
        Abc obj= new show();
        obj.show(); //we cannot call methods which are not declared inside interface using interface reference
    }
}
interface Abc //Interface
{
    void show();
}
class show implements Abc
{
    public void show()
    {
        System.out.println("Interface Example");
    }
    public void display()
    {
        System.out.println("Interface Demo");
    }
}
