/*
 * StringBuffer and StringBuilder both these classes provide string mutability
 * 
 */
package StringOperations;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("shubham");
        sb.append(" gupta");
        sb.delete(5, 8);
        System.out.println(sb);
        StringBuilder sd = new StringBuilder("Sonam");
        sd.append(" Gupta");
        System.out.println(sd);
        String s = "Monam";
        //there is no reverse method in String class
    }
    
}
