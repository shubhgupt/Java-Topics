
package javaapplication1;

public class Inheritance {
    public static void main(String[] args) {
        AddSubMul obj = new AddSubMul();
        obj.num1 = 9;
        obj.num2= 39;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mul();
        System.out.println(obj.result);
    }
}
abstract class Add //Parent, Super, Base
{
    int num1,num2,result;
    public void sum()
    {
        result= num1 + num2;
    }
}
//Child, Sub, Derived
class AddSub extends Add  //Single level Inheritance
{
    public void sub()
    {
        result= num1 - num2;
    }
}
class AddSubMul extends AddSub  //Multi-level Inheritance
{
    public void mul()
    {
        result= num1*num2;
    }
}