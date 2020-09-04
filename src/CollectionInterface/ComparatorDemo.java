package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            values.add(r.nextInt(1000));
        }
        
//        Comparator<Integer> com = new Comp();
//        Collections.sort(values,com); we can use these two lines on code instead of below code
//        both work exactly same.

        Collections.sort(values,(o1,o2) ->
        {
            return o1%10>o2%10?1:-1;
        });
        values.forEach(System.out::println);
    }
    
}
class Comp implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%10 > o2%10)
            return 1;
        return -1;
    }
    
}
