
package Singleton_class;


//Sigleton class is a class which can be instantiated only once.
public class Singleton_Demo1 {
    public static void main(String[] args) {
        Abc obj = Abc.obj;
    
    }
    
}
class Abc
{
    public static Abc obj = new Abc();
    private Abc()
    {
    }
    public static Abc getInstance() 
    {
        return obj;
    }
    
}