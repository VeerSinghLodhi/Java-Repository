
public class Krishna1 {
    public static void main(String [] args)
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
