import java.util.ArrayList;
import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수:");
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }
        int max = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i))
                max = arr.get(i);
        }
        System.out.println("가장 큰 수는 " + max);
    }
}
