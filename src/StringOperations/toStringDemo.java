/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOperations;

public class toStringDemo {
    public static void main(String[] args) {
        Student s1 = new Student(86, "Shubham Gupta");
        System.out.println(s1);
    }
}
class Student{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name=" + name + '}';
    }
    
}
