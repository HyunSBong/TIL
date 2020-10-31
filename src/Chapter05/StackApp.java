//package Chapter05;
//import java.util.Scanner;
//interface Stack {
//    int length(); // 현재 스택에 저장된 개수 리턴
//    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
//    String pop(); // 스택의 톱(top)에 실수 저장
//    boolean push(String val); // 스택의 톱(top) 저장된 실수 리턴
//}
//
//class StringStack implements Stack {
//    private int able;
//    private int set;
//    private String arr[];
//    StringStack (int size) {
//        this.able = size;
//        this.set = 0;
//        arr = new String[size];
//    }
//    @Override
//    public int length() {
//        return able;
//    }
//    @Override
//    public int capacity() {
//        return set;
//    }
//    @Override
//    public String pop() {
//        if (set-1 < 0)
//            return null;
//        set--;
//        return arr[set];
//    }
//    @Override
//    public boolean push(String val) {
//        if (set<able) {
//            arr[set] = val;
//            set++;
//            return true;
//        }
//        else
//            return false;
//    }
//}
//public class StackApp {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
//        int size = sc.nextInt();
//        StringStack s = new StringStack(size);
//        while (true) {
//            System.out.print("문자열 입력 >>" );
//            String val = sc.next();
//            if (val.equals("그만")) {
//                break;
//            }
//            if (s.push(val) == false)
//                System.out.println("스택이 꽉 차서 푸쉬 불가!");
//        }
//        System.out.print("스택에 저장된 모든 문자열 팝 : ");
//        for (int i = 0; i < s.capacity(); i++) {
//            System.out.print(s.pop()+" ");
//        }
//    }
//}
