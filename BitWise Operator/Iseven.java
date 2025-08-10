public class Iseven {

    static boolean even(int n){
       
        return (n & 1) ==0;
    }
    public static void main(String[] args) {
        int n = 5;
      System.out.println(even(n));
        
    }
}