package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo2 {
    public static void main(String[] args) {
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(1,"Shubham",87));
        studs.add(new Students(2,"Nitin",56));
        studs.add(new Students(3,"Mukesh",65));
        studs.add(new Students(4,"Rahul",26));
        studs.add(new Students(5,"Ramesh",93));
        
        Collections.sort(studs, (Students s1,Students s2) ->
        {
            if(s1.marks<s2.marks)
                return 1;
            return -1;
        }
        );
        
        for(Students s: studs)
        {
            System.out.println(s);
        }
    }
}
class Students
{
    int rollno;
    int marks;
    String name;
    
    public Students(int rollno,String name,int marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return " "+name+"{ rollno=" + rollno + ", marks=" + marks + "}";
        
        
    }
    
}