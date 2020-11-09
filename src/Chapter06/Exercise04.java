package Chapter06;

import java.util.Scanner;
import java.util.Vector;

public class Exercise04 {
    /*Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라.
    강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> arr = new Vector<Integer>();
        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int num = sc.nextInt();
            if (num == 0)
                break;
            arr.add(num);
            int average = 0;
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
                average += arr.get(i);
            }
            average = average/arr.size();
            System.out.println("현재평균 "+average);
        }
    }
}
