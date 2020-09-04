
package practice;

/**
 *We can use marker interface to give permission to the class for doing something...
 * 
 */
public class MarkerInterface {
    public static void main(String[] args) {
        Client suresh= new Client();
        if(suresh instanceof Permission)
        {
            suresh.show();
        }
        else
            System.out.println("No Permission");
    }
}
interface Permission // Marker Interface
{
    
}
class Client implements Permission
{
    public void show()
    {
        System.out.println("Permission Granted");
    }
}