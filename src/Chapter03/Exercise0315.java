package Chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("곱하고자 하는 두 수 입력 >> ");
        while (true) {
            try {
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine();
            }
            sc.close();
        }
    }
}
