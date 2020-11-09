package Chapter06;
import java.util.Vector;

interface  IStack<T> {
    T pop();
    boolean push(T ob);
}
class MyStack<T> implements IStack<T> {
    Vector<T> arr = null;
    MyStack () {
        arr = new Vector<T>();
    }
    public T pop() {
        if (arr.size() == 0)
            return null;
        else
            return arr.remove(0);
    }
    public boolean push(T ob) {
        arr.add(0, ob);
        return true;
    }
}

public class Exercise09 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if (n == null)
                break;
            System.out.print(n + " ");
        }
    }
}