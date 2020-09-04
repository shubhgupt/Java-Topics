
package practice;

public class This_keyword {
    public static void main(String[] args) {
        a obj = new a(3);
        obj.show();
    }
}
class a
{
    private int x;//Instance variable
    public a(int x) // Local variable
    {
        
        this.x= x;  // Current Instance
    }
    public void show()
    {
        
        System.out.println("x is "+ x);
    }
}
