
package number_programs;

public class PrimeNumberorNot {
    
    public static boolean isPrimeNumber(int num)
    {
        boolean ans=true;
        if(num==1 || num<=0)
        {
            ans=false;
        }
        
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                ans=false;
        }
        return ans;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        boolean result=isPrimeNumber(num);
        if(result)
        {
            System.out.println(num+" is a Prime number ");
        }
        else
        {
            System.out.println(num+" is not a Prime number ");
        }
    }
}
