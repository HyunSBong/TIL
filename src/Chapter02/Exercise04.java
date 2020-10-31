package Chapter02;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a<b&&b<c) || (c<b&&b<a)) {
            System.out.println("중간 값은 "+b);
        }
        else if ((b<a&&a<c) || (c<a&&a<b)) {
            System.out.println("중간 값은 "+a);
        }
        else {
            System.out.println("중간 값은 "+c);
        }
        sc.close();
    }
}
