import java.util.ArrayList;
import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for (int i = 0; i < 6; i++) {
            char c = sc.next().charAt(0);
            arr.add(c);
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            char c = arr.get(i);
            if (c == 'A')
                sum += 4;
            else if (c == 'B')
                sum += 3;
            else if (c == 'C')
                sum += 2;
            else if (c == 'D')
                sum += 1;
            else if (c == 'F')
                sum += 0;
        }
        double average = (double)sum/ arr.size();
        System.out.println(average);
        sc.close();
    }
}