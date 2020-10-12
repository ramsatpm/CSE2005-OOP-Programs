public class GenericTypesDifferDemo {
    public static void main(String args[])
    {
        GWO<Integer> integerObject = new GWO<Integer>(12);
        GWO<String> stringObject = new GWO<String>("MeritCampus");
        integerObject = stringObject; // LINE A
        integerObject.print(); // LINE B
    }
}
class GWO<T>
{
    T obj;
    GWO(T obj)
    {
        this.obj = obj;
    }
    void print()
    {
        System.out.println(obj);
    }
}