import java.util.Scanner;
import java.util.Vector;

public class Exam03 {
    public static void Max(Vector<Integer> v) {
        int max = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            if (max < v.get(i))
                max = v.get(i);
        }
        System.out.println("가장 큰 수는 " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1)
                break;
            v.add(num);
        }
        Max(v);
        sc.close();
    }
}