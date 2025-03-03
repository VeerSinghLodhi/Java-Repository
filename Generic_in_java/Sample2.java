
package Generic_in_java;

public class Sample2<T extends Number> {
    T a,b;
    Sample2(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        double c;
        c=a.doubleValue()+b.doubleValue();
        System.out.println("Sum is "+c);
    }
}
