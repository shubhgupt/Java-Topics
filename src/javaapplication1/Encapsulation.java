
package javaapplication1;

public class Encapsulation {
    public static void main(String[] args) {
        Aa obj = new Aa();
        obj.setI(8);
        System.out.println(obj.getI());
    }
}
class Aa
{
    private int i;
    public void setI(int j)
    {
        i=j;
    }
    public int getI()
    {
        return i;
    }
}