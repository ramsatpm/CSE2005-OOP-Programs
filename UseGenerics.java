class MyGen<T>
{
    T var;
    void  set(T var)
    {
        this.var = var;
    }
    T get()
    {
        return var;
    }
}
public class UseGenerics {
    public static void main(String args[]){  
        MyGen<Double> m = new MyGen<Double>();  
        m.set(10.0f);
        System.out.println(m.get());
    }
}