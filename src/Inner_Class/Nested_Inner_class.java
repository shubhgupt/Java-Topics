
package Inner_Class;

public class Nested_Inner_class {
    public static void main(String[] args) {
        Outer.inner obj = new Outer.inner();
        obj.show();
        obj.j = 3;
        System.out.println("value of j is "+ obj.j);
    }
    
}
class Outer
{
    int i;
    static class inner
    {
        int j;
        public void show()
        {
            System.out.println("In inner Show");
        }
    }
}