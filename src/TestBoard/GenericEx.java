package TestBoard;

class GStack<T> {
    int tos;
    Object [] stck;
    public GStack() {
        tos = 0;
        stck = new Object[10];
    }
    public  void push(T item) {
        if (tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if (tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}
public class GenericEx {
    public static void main(String[] args) {
        GStack<String> st = new GStack<String>();

        st.push("seoul");
        st.push("LA");
        st.push("paris");

        for (int i = 0; i < 3; i++) {
            System.out.println(st.pop());
        }

        GStack<Integer> intStack = new GStack<Integer>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        for (int i = 0; i < 3; i++) {
            System.out.println(intStack.pop());
        }
    }
}
