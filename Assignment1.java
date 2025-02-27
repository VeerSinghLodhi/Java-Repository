
public class Assignment1 {
    public static void main(String [] args)
    {
        String str="danger";//ebohfs
        String secretCode="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='z')
                ch=96;
            if(ch=='Z')
                ch=64;
            secretCode+=(char)(ch+1);
        }
        System.out.println("Secret Code : "+secretCode);
    }
}
