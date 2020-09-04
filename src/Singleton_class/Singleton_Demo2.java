package Singleton_class;

                        // Lazy Instantiation //
public class Singleton_Demo2 {
    public static void main(String[] args) {
        A obj = A.getInstance();
        A obj2 = A.getInstance(); 
        // if you think now it is good to use so you are wrong my dear friend because if we use 
        // multiple threads hear then we can create two instances.
    }
}
class A
{
    public static A obj;
    private A()
    {
    }
    public static A getInstance() 
    {
        if(obj == null)
            obj = new A();
        
        return obj;
    }
    
}