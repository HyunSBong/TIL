package Chapter02;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        int a = 0;
        int b = 0;

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        num = sc.nextInt();
        System.out.print("박수");
        if (num>=10) {
            a = num/10;
            b = num%10;
            if (a%3==0)
                System.out.print("짝");
            if (b%3==0)
                System.out.print("짝");
        }
        else {
            if((num%3==0) ||(num%6==0) || (num%9==0))
                System.out.print("짝");
        }
    }
}
