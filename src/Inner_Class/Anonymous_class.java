package Inner_Class;

public class Anonymous_class {
    public static void main(String[] args) {
        C obj = new C()
        {
          public void show()  
          {
              System.out.println("How you doing!");
          }
        };
        obj.show();
    }
}
class C
{
    public void show()
    {
        System.out.println("You are Doing Great!");
    }
}
