
package Wrapper_classes;

import java.util.ArrayList;

/**
 *
 * @author S
 */
public class wrapperclasses {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(i); //Boxing
        Integer jj = i;              //AutoBoxing
        
        int j = jj.intValue();       //UnBoxing
        int k = jj;                  //AutoUnBoxing
        
        //wrapper classes can be used with frameworks
        //if you want to creat an arraylist of integers you can use wrapper classes 
        ArrayList<Integer> a = new ArrayList<Integer>(8);
        a.add(8);
        a.add(83);
        //a.add("shubh") will throw an error
    }
}
