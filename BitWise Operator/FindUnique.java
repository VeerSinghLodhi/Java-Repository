public class FindUnique {
   

    static int unique(int arr[]){
        int u =0;
        for(int n:arr){
            u ^= n;
        }
        return u;
    }
    
    public static void main(String[] args){
        int arr[] = {1,1,33,44,44,6,6};
        int num = unique(arr);
        System.out.println("Unique num is : " + num);
    }
}
