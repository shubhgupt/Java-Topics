
package javaapplication1;
public class JavaApplication1 {

    
     static public void main(String ... args) {
       Display obj = new Display();
        obj.show(354,43,7,56,6);
    }
    
}
class Display
{
    public void show(int ...a)
    {
        System.out.println(a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }
}