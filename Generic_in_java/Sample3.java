
package Generic_in_java;

public class Sample3<T> {
    T a,b;
    Sample3(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        if(a instanceof Number && b  instanceof Number)
        {
            double c;
            c=((Number)a).doubleValue()+((Number)b).doubleValue();
            System.out.println("Sum is "+c);
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}
