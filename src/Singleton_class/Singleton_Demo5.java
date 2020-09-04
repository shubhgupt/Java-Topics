
package Singleton_class;

public class Singleton_Demo5 {
    public static void main(String[] args) {
        S obj = S.INSTANCE;
        obj.i= 5;
        obj.show();
        
        S obj2 = S.INSTANCE;
        obj.i = 7;
        obj.show();
    }
}
// This is the most efficient way of creating a singelton design pattern
enum S // special type of class
{
    INSTANCE;
    int i; 
    public void show()
    {
        System.out.println(i);
    }
}
