package Chapter02;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원의 중심과 반지름 입력>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int radius = sc.nextInt();
        System.out.println("점 입력>>");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();

        double distance = Math.sqrt(((a-x1)*(a-x1))+((b-y1)*(b-y1)));
        if(distance<radius) {
            System.out.print("점 ("+x1+","+y1+")는 원 안에 있다.");
        }
        else {
            System.out.print("점 ("+x1+","+y1+")는 원 안에 없다.");
        }

        sc.close();
    }
}
