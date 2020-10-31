package Chapter02;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        int a = sc.nextInt();
        String cal = sc.next();
        int b = sc.nextInt();

        if(cal.equals("+"))
            System.out.println(a+"+"+b+"의 계산결과는 "+(a+b));
        else if(cal.equals("-"))
            System.out.println(a+"-"+b+"의 계산결과는 "+(a-b));
        else if(cal.equals("*"))
            System.out.println(a+"*"+b+"의 계산결과는 "+(a*b));
        else if(cal.equals("/")) {
            if (b == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
            }
            else {
                System.out.println(a+"/"+b+"의 계산결과는 "+(a/b));
            }
        }
    }
}
