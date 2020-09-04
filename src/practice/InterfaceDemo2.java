
package practice;
/*
Marker Interface -> without any methods
SAM -> single abstract method(Functional Interface)
Normal Interface
*/
interface i
{
    void show();
}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        i obj = new i()
                {
                    public void show()
                    {
                        System.out.println("In show1");
                    }
                };
        obj.show();
        /*
        When there is only one method in our interface we can use lamda expression
        */
        i obj2= ()->
        {
            System.out.println("In show2");
        };
        obj2.show();
        //If there is only one statement inside the method then we can use the code shown below
        i obj3 = ()-> System.out.println("In show3");
        obj3.show();
    }
}
