
public class ReverseInt {
    public static void main(String [] args)
    {
        java.util.Scanner s1=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s1.nextInt();
        int result=getReverseInt(num);
        System.out.println("Result is "+result);
    }
    static int getReverseInt(int num)
    {
        int reverseInt=0;
        while(num!=0)
        {
            int digit=num%10;
            reverseInt=reverseInt*10+digit;
            num/=10;
        }
        return reverseInt;
    }
}
