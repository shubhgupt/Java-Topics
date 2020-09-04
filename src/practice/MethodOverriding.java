
package practice;

/**
 *Polymorphism
 *Method Overriding
 */
public class MethodOverriding {
    public static void main(String[] args) {
        Aa obj = new Aa();
        B obj2 = new B();
        obj.show();
        obj2.show();
        test a;
        a = obj;
        a.show();
    }
}
class test 
{
    public void show()
    {
        System.out.println("In show test");
    }
}
class Aa extends test
{
    @Override
    public void show()
    {
        System.out.println("In show A");
    }
}
class B extends Aa
{
    @Override
    public void show()
    {
        System.out.println("In show B");
    }
}