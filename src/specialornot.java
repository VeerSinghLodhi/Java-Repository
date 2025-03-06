
public class specialornot {
    
    public static void main(String[] args) {
        
        int num=145;
        int result=getSumNumber(num);
   
        if(result==num)
        {
            System.out.println("\nIt is a Special number!");
        }
        else
        {
            System.out.println("\nIt is not a Special number !");
        }

    }
public static int getFactorial(int num)//5
{
    if(num==0 || num==1)
        return 1;

    return num*getFactorial(num-1);
}
public static int getSumNumber(int num)//145
{
    int sum=0;
    while(num!=0)
    {
        int digit=num%10;
        sum+=getFactorial(digit);
        num/=10;
    }
   // printf(sum);
    return sum;

}

    
}
