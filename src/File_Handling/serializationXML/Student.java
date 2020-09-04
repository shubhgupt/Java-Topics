
package File_Handling.serializationXML;

public class Student {
    private int Sroll;
    private String Sname;

    public int getSroll() {
        return Sroll;
    }

    public void setSroll(int Sroll) {
        this.Sroll = Sroll;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    @Override
    public String toString() {
        return "Student{" + "Sroll=" + Sroll + ", Sname=" + Sname + '}';
    }
    
}
