
public class CollegeStudent extends Student {
    String department;
    
    void setCollegeStudent(String department)
    {
        this.department=department;
    }
    void getCollegeStudent()
    {
        System.out.println("Department is "+department);
    }
}
