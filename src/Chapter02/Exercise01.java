package Chapter02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원) >>");
        int won = sc.nextInt();
        double result = won/1100;
        System.out.println(won+"원은 $"+result+"입니다.");

    }
}
