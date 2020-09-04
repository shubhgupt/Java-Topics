
package Annotations;

import java.util.ArrayList;

public class Annotation_Demo1 {
    public static void main(String[] args) {
        
    }
}
@FunctionalInterface // Now we can not declare one more method inside interface
interface demo
{
    void show();
    
}
class A
{
    public void showThePreviousDataFromDatabase()
    {
        System.out.println("In a");
    }
}
class B extends A
{
    @Deprecated // it is used to show this method is no more in use
    public void show()
    {
        System.out.println("In B show");
    }
    @Override 
    @SuppressWarnings("unchecked") // to suppress warnings in a method
    public void showThePreviousDataFromDatabase()
    {
        ArrayList a = new ArrayList();
        System.out.println("In B");
    }
}