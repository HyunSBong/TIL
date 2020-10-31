package Chapter02;
import java.util.Scanner;
public class Exercise0204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오.>>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a < b && b < c) || (c < b && b < a)) {
            System.out.print("중간 값은 "+b);
        }
        else if ((b < a && a < c)  || (c < a && a < b)) {
            System.out.print("중간 값은 "+a);
        }
        else {
            System.out.print("중간 값은 "+c);
        }

        sc.close();
    }

}

