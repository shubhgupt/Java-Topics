
package practice;

public class Super_Keyword {
    public static void main(String[] args) {
        D obj = new D(8);
        I obj2= new I();
        obj2.show();
        obj2.abc();
    }
}
class C
{
    public C()
    {
        System.out.println("In const C");
    }
    public C(int i)
    {
        System.out.println("In const C para");
    }
}
class D extends C
{
    public D()
    {
        System.out.println("In const D");
    }
    public D(int i)
    {
       super(8);
        System.out.println("In const D para");
    }
}
class E
{
    protected int i=5;
    public void abc()
    {
        System.out.println("In E abc");
    }
}
class I extends E
{
  
    int i = 4;
    public void show()
    {
        System.out.println(super.i);
    }
    @Override
    public void abc()
    {
        super.abc();
        System.out.println("In I abc");
    }
}
