
class Odd{

    public static boolean isOdd( int n){
       
           return (n&1) ==1;
        
    }
    public static void main(String[] args){
      
      System.out.println(isOdd(5));

    }
}