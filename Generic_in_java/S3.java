
package Generic_in_java;

public class S3 {

    public static void main(String[] args) {
        // For Integer
        Sample3<Integer> s3=new Sample3<>(20,30);
        s3.add();
        //For Double
        Sample3<Double> s4=new Sample3<>(4.5,2.3);
        s4.add();
        //For String
        Sample3<String> s5=new Sample3<>("Good","Morning");
        s5.add();
    }
    
}
