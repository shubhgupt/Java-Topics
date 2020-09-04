
package Singleton_class;
                    
                            // Double Checked Locking //

public class Singleton_Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                C obj1 = C.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                C obj2 = C.getInstance();
            }
        });
        t1.start();
        t2.start(); 
    }
}
class C
{
    public static C obj;
    private C()
    {
        System.out.println("Instance Created");
    }

    public static C getInstance()
    {
        if(obj == null)
        {
            synchronized(C.class)
            {
                if(obj == null)
                    obj = new C();
            }
        }
        return obj;
    }
}
