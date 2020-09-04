
package javaapplication1;

public class StaticBlock {
    static
    {
        System.out.println("Hello World!");
        sa.sd();
    }
    public static void main(String[] args) {
        System.out.println("In Main");
        
    }
    static
    {
        System.out.println("Bye in static 2");
    }
}
class sa
{
    static
    {
        System.out.println("in sa");
    }
    public static void sd()
    {
        System.out.println("in sd");
    }
    static 
    {
        System.out.println("in sa 2");
    }
}
