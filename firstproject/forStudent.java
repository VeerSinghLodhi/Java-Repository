package firstproject;


import firstproject.School_Student;
import firstproject.CollegeStudent;


public class forStudent {

    
    public static void main(String[] args) {
        
        School_Student s1=new School_Student();
        s1.setStudent(101, "Veer Singh Lodhi", "Male");
        s1.setSchool_Student("10th");
        s1.getStudent();
        s1.getSchool_Student();
        
        System.out.println("================================================");
        
        CollegeStudent c1=new CollegeStudent();
        c1.setStudent(102, "Krishna Kurmi", "Male");
        c1.setCollegeStudent("CS");
        c1.getStudent();
        c1.getCollegeStudent();
        
        
        
    }
    
}
