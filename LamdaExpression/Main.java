public class Main {
    public static void main(String[] args) {
        
        // Normal code
        SumInter obj=new SumInter() {
            @Override
            public int sum(int a,int b){
                return a+b;
            }
        };
        int res=obj.sum(10,20);
        System.out.println("Sum is "+res);
    }
    
}
