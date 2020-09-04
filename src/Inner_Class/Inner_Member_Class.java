package Inner_Class;

public class Inner_Member_Class {
    public static void main(String[] args) {
        A obj = new A();
        obj.i = 38;
        A.B obj1 = obj.new B();
        obj1.j= 83;
        
        System.out.println(obj.i + " " + obj1.j);
    }
}
class A
{
    int i; 
    class B
    {
        int j;
    }
}