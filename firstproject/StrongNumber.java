
package number_programs;

public class StrongNumber {
    public static int isStrongNumber(int number)
    {
        int sum=0;
        int product=1;
        while(number!=0)
        {
            int digit=number%10;
            sum+=digit;
            product*=digit;
            number/=10;
        }
        return sum+product;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        int result=isStrongNumber(number);
        if(result==number)
        {
            System.out.println(number+" is a Strong number");
        }
        else
        {
            System.out.println(number+" is not a Strong number");
        }
    }
}
