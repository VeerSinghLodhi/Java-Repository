
public class NewMain11 {

    public static void main(String[] args) {
        String name="Veer Singh Lodhi";  //  VSL
        
        String shortName="";
        shortName+=name.charAt(0);
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(Character.isWhitespace(ch))
            {
                shortName+=name.charAt(i+1);
            }
        }
        System.out.println(shortName);
    }
    
}
