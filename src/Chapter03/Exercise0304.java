package Chapter03;
import java.util.Scanner;
public class Exercise0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char c;

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        s = sc.next();
        c = s.charAt(0); // c는 e

        for (int i = 0; i < c-'a'; i++) { // c-'a' 의 값은 4
            for (char j = 'a'; j < c-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        char c;
//
//        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
//        s = sc.next();
//        c = s.charAt(0);
//
//        for(int i = 0; i<=c-'a'; i++) {
//            for(char j = 'a'; j<= c-i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
}
