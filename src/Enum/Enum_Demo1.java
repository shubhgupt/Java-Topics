package Enum;

enum Mobile
{
    APPLE,SAMSUNG,HTC;
}

public class Enum_Demo1 {
    public static void main(String[] args) {
        Mobile model = Mobile.HTC;
        switch(model)
        {
            case APPLE:
                System.out.println("You have the best mobile of present time");
                break;
            case SAMSUNG:
                System.out.println("YOu have the one of the best mobile of present time");
                break;
            default :
                System.out.println("You have some usual Mobile of present time");
        }
    }
}
