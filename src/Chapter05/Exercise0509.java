package Chapter05;

import java.util.Scanner;

interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 실수 저장
    boolean push(String val); // 스택의 톱(top) 저장된 실수 리턴
}
class StringStack implements Stack {
    private int able; // 저장 가능한 개수
    private int set; // 저장된 개수;
    private String[] stack;
    StringStack (int able) {
        this.able = able;
        this.set = 0;
        stack = new String[able];
    }
    public int length() {
        return set;
    }
    public int capacity() {
        return able;
    }
    public String pop() {
        if (set-1<0)
            return null;
        set--;
        String result = stack[set];
        return result;
    }
    public boolean push(String val) {
        if (set < able) {
            stack[set] = val;
            set++;
            return true;
        }
        else
            return false;
    }
}
public class  Exercise0509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력>> ");
        int size = sc.nextInt();
        StringStack s = new StringStack(size);
        while (true) {
            System.out.print("문자열 입력 >> ");
            String val = sc.next();
            if (val.equals("그만"))
                break;
            if (!s.push(val))
                System.out.println("스택이 꽉 차서 푸시 불가!");
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for (int i = 0; i <s.capacity(); i++) {
            System.out.print(s.pop()+" ");
        }
        sc.close();
    }
}
