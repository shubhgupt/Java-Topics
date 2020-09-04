
package Singleton_class;

public class Singleton_Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                B obj1 = B.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                B obj2 = B.getInstance();
            }
        });
        t1.start();
        t2.start(); // Now two instance can be created easily and the concept of singleton is lost.
    }
}
class B
{
    public static B obj;
    private B()
    {
        System.out.println("Instance Created");
    }
    /* if you are thinking that making it synchronized is a good solution but it is not because 
     when we make any method synchronized it increases the time consumption by 100 times so, if
    our method consists of 100s of lines then you can think what gonna happen */
    public static synchronized B getInstance()
    {
        if(obj == null)
            obj = new B();
        
        return obj;
    }
}
