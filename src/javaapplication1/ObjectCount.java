
package javaapplication1;

public class ObjectCount {
    public static void main(String[] args) {
        S obj1= new S();
        S obj2= new S();
        S obj3= new S();
        S obj4= new S();
        S obj5= new S();
        S.count();
    }
}
class S
{
    static int i=0;
    public S()
    {
        i++;
    }
    public static void count()
    {
        System.out.println("The no. of objects created are: "+ i);
    }
}