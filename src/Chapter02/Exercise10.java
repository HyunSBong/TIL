package Chapter02;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 원의 중심과 반지름 입력>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int radius = sc.nextInt();
        System.out.println("두번째 원의 중심과 반지름 입력>>");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int radius2 = sc.nextInt();

       double distance = Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d)));
        if(distance<=radius+radius2) {
            System.out.print("두 원은 서로 겹친다.");
        }
        else {
            System.out.print("두 원은 서로 겹치지 않는다.");
        }

        sc.close();
    }
}
