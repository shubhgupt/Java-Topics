package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<CollegeStudent> studs = new ArrayList<>();
        studs.add(new CollegeStudent(1,"Shubham",87));
        studs.add(new CollegeStudent(2,"Nitin",56));
        studs.add(new CollegeStudent(3,"Mukesh",65));
        studs.add(new CollegeStudent(4,"Rahul",26));
        studs.add(new CollegeStudent(5,"Ramesh",93));
        
        Collections.sort(studs);
        
        for(CollegeStudent s: studs)
        {
            System.out.println(s);
        }
    }
}
class CollegeStudent implements Comparable<CollegeStudent>
{
    int rollno;
    int marks;
    String name;
    
    public CollegeStudent(int rollno,String name,int marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return " "+name+"{ rollno=" + rollno + ", marks=" + marks + "}";
        
        
    }
    public int compareTo(CollegeStudent cs)
    {
        return this.marks>cs.marks?-1:this.marks<cs.marks?1:0;
    }
    
}