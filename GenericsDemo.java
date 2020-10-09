import java.util.*;
public class GenericsDemo {
    public static void main(String args[]) {
        GenericStack<Integer> obj = new GenericStack<Integer>();
        GenericStack<Double> ds = new GenericStack<Double>();
        obj.push(36);
        ds.push(35.0);
        System.out.print(obj.pop()+" ");
        System.out.println(ds.pop());
    }
}
class GenericStack<E>
{
    Stack <E> ob = new Stack <E>();
    public void push(E obj) {
        ob.push(obj);
    }
    public E pop() {
        E obj = ob.pop();
        return obj;
    }
}