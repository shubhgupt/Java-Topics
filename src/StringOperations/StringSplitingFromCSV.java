
package StringOperations;


public class StringSplitingFromCSV {
    public static void main(String[] args) {
        String str = "Shubham,Gupta,Programmer";
        
        String shubh[] = str.split(",");//split methods splits the string acc. to the character we specify in ""
        for(String val: shubh)
            System.out.println(val);
    }
}
