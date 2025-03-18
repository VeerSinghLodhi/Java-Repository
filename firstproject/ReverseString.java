
package number_programs;

public class ReverseString {
    
    public static String getReverseString(String str)
    {
        String reversedString="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversedString+=str.charAt(i)+"";
        }
        return reversedString;
    }
    public static void main(String [] args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        String result=getReverseString(str);
        System.out.println("Reversed String is "+result);
    }
    
}
