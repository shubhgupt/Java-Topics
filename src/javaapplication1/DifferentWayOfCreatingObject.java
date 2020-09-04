
package javaapplication1;

public class DifferentWayOfCreatingObject {
    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("javaapplication1.aa");
        aa obj = (aa)c.newInstance();
        obj.aab();
    }
}
