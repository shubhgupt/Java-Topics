
package javaapplication1;
public class constructorOverloading {
    public static void main(String[] args) {
        A obj = new A();
    }
}
class A
{
    public A()
    {
        System.out.println("default constructor");
    }
    public A(int a)
    {
        System.out.println("paramaterized constructor");
        
    }
    
}