
package cloning;

/**
 *Shallow copy
 *Deep copy
 * Clone
 */
public class cloningDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.i= 5;
        obj.j= 6;
        
//        A obj1 = obj;  //*Shallow copy*//
//        obj1.i= 8;
//        System.out.println(obj1);
//        System.out.println(obj);
            
        A obj2 = new A();  //Deep copy//
        obj2.i = obj.i;
        obj2.j = obj.j;
        
        obj2.j = 8;
        System.out.println(obj2);
        System.out.println(obj);
        
    }
}
class A
{
    int i,j;

    @Override
    public String toString() {
        return "A{" + "i=" + i + ", j=" + j + '}';
    }
    
}
