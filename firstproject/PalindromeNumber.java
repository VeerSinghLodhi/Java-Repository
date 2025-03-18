package number_programs;

public class PalindromeNumber {
    
    public static int getReverseInt(int number)
    {
        int reversed=0;
        while(number!=0)
        {
            int digit=number%10;
            reversed=reversed*10+digit;  // 3 32  320+1=321
            number/=10;
        }
        return reversed;
    }
    public static void main(String []args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        int reverseInt=getReverseInt(number);
        if(number==reverseInt)
        {
            System.out.println(number +" is a Palindrome number");
        }
        else
        {
            System.out.println(number+" is not a Palindrome number");
        }
    }
}
