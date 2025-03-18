
package number_programs;

public class ReverseInteger {
    
    public static int getReverseInteger(int number)
    {
        int reversedInt=0;
        while(number!=0)
        {
            int digit=number%10;
            reversedInt*=10;
            reversedInt+=digit;
            number/=10;
        }
        return reversedInt;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        int reversedInt=getReverseInteger(number);
        System.out.println("Reversed Integer is "+reversedInt);
    }
}
