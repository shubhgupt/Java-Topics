package Inner_Class;

public class Lambda_Expression {
    public static void main(String[] args) {
//        B obj = () ->
//        {
//            System.out.println("Inside Lambda expression code");
//        };
        
        B obj = () ->  System.out.println("Inside Lambda expression code");
        obj.show();
    }
}
@FunctionalInterface
interface B
{
    void show();
}
