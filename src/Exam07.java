import java.util.Scanner;
import java.util.Vector;

public class Exam07 {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int num = sc.nextInt();
            if (num == 0)
                break;
            arr.add(num);
            int average = 0;
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i)+" ");
                average += arr.get(i);
            }
            average = average/arr.size();
            System.out.println("\n현재 평균 "+average);
        }
    }
}
