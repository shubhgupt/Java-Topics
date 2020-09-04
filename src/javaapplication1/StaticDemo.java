
package javaapplication1;

public class StaticDemo {
    public static void main(String[] args) {
        Abc obj1 = new Abc();
        Abc obj2 = new Abc();
        Abc obj3 = new Abc();
        
        obj1.num2=7;
        obj1.show();
        obj1.show();
        obj1.num1=1;
        obj2.num1=2;
        obj3.num1=3;
    }
}
class Abc
{
    int num1;
    static int num2;
    public void show()
    {
        System.out.println(num2++);
    }
}
