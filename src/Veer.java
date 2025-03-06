
public class Veer {
    public static void main(String [] args)
    {
        java.util.Scanner s1=new java.util.Scanner(System.in);
        int choice;
        char c;
        do{
            System.out.println("1. Even or Odd");
            System.out.println("2. Greater Number");
            System.out.println("3. Reverse Integer");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            choice=s1.nextInt();
            if(choice==1)
                getEvenOdd();
            else if (choice==2)
                getGreaterNumber();
            else if(choice==3)
                getReverseInt();
            else
                System.exit(0);
            s1.nextLine();
            
            System.out.print("Do you want to continue ? Y/N : ");
            c=s1.nextLine().charAt(0);
            
        }while(c=='y' || c=='Y');
        
    }
    static void getEvenOdd()
    {
        java.util.Scanner s1=new java.util.Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num=s1.nextInt();
        
        if(num%2==0)
            System.out.println("Even");
        else
           System.out.println("ODD");
    }
    static void getReverseInt()
    {
        
        java.util.Scanner s1=new java.util.Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s1.nextInt();
        int reverseInt=0;
        while(num!=0)
        {
            int digit=num%10;
            reverseInt=reverseInt*10+digit;
            num/=10;
        }
        System.out.println("Result is "+reverseInt);
    }

static void getGreaterNumber()
{
    java.util.Scanner s1=new java.util.Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter 1 number : ");
        num1=s1.nextInt();
        System.out.print("Enter 2 number : ");
        num2=s1.nextInt();
        System.out.print("Enter 3 number : ");
        num3=s1.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1+" is Greater ");
        else if (num2>num1 && num2>num3)
            System.out.println(num2+" is greater ");
        else
            System.out.println(num3+" is greater ");
        
}
}