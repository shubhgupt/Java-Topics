
package StringOperations;

public class PatternMatching {
    public static void main(String[] args) {
        String text = "Shubhamgupta";
        String pattern = "up";
        
//        boolean result = text.contains(pattern);
//        
        int l1= text.length();
        int l2 = pattern.length();
        int j=0;
        boolean result = false;
         for(int i=0;i<=l1-l2;i++)
         {
             
             if(text.charAt(i)==pattern.charAt(j))
             {
                j++;
                if(j == l2)
                {
                    result = true;
                    break;
                }
             }
             else
                 j=0;
         }
        
        if(result)
            System.out.println("Pattern Found");
        else
            System.out.println("Pattern does not found");
    }
    
}
