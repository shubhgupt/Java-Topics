package Enum;
//We type enum like this but compiler treats enum like a class as shown below.
// enum can not extend any class but it can implement an interface.
enum MobileComp
{
    APPLE(234), SAMSUNG,HTC(97);
    int price = 938;
    MobileComp()// for every constant this constructor is called if no parameter is passed
    {
        price = 787;
        System.out.println("you are in constructor!!");
    }
    MobileComp(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
}

//class MobileComp
//{
//   static final MobileComp Apple = new MobileComp(234);
//   static final MobileComp SAMSUNG = new MobileComp();
//   static final MobileComp HTC = new MobileComp(97);
//   
//}
public class Enum_Demo2 {
    public static void main(String[] args) {
        System.out.println(MobileComp.APPLE.getPrice());
        MobileComp m[] = MobileComp.values();
        for(MobileComp comp : m)
            System.out.println(comp);
        
        MobileComp model = MobileComp.APPLE;
        System.out.println(model.ordinal());
    }
}
