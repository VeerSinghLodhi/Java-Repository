
public class School_Student extends Student {
    
    String Class ;
    
    void setSchool_Student(String Class)
    {
        this.Class=Class;
    }
    void getSchool_Student()
    {
        System.out.println("Studying in "+Class);
    }
    
}