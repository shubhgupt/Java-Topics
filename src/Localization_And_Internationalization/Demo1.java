
package Localization_And_Internationalization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/*
* There is concept called Localization and Internationalization because in different places people 
* understand different languages so our program should be understable to them.
* L10N -> Localization (there are 10 characters b/w L and N)
* I10N -> Internationalization (there are 18 characters b/w I and N)
* For localization we use two classes called
* Locale
* ResourceBundle 
* They both belongs to the package java.util
*/


public class Demo1 {
    public static void main(String[] args) {
        
        /* change the country and language name to see the wish in different language and
        *  we hav to specify the name of property file as Bundle_langName_countryNamme
        * so that while we are using the ResourceBundle we don't have to specify the exact name of file
        */
        String lang ="hi";
        String country = "IN";
        
        Locale L = new Locale(lang,country);
        ResourceBundle r = ResourceBundle.getBundle("Localization_and_Internationalization/Bundle",L);
            
        String str = r.getString("wish");
        System.out.println(str);
    }
}
