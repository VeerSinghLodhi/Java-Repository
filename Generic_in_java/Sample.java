
package Generic_in_java;

public class Sample<T> {
    T a,b;
    Sample(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
