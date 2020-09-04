
package cloning;

public class cloneDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Abc obj = new Abc();
        obj.i= 5;
        obj.j= 6;
        Abc obj2 = (Abc)obj.clone();
        
        obj2.j= 8;
        System.out.println(obj2);
        System.out.println(obj);
    }
}
class Abc implements Cloneable
{
    int i,j;

    @Override
    public String toString() {
        return "Abc{" + "i=" + i + ", j=" + j + '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
