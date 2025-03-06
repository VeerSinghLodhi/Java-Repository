package firstproject;


public class Student {
        
    int rollno;
    String name,gender;
    void setStudent(int rollno,String name,String gender)
    {
        this.rollno=rollno;
        this.name=name;
        this.gender=gender;
    }
    
    void getStudent()
    {
        System.out.println("Roll no is "+rollno);
        System.out.println("Name is "+name);
        System.out.println("Gender "+gender);
    }
}
