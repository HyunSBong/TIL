package Chapter02;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int num = sc.nextInt();
        System.out.println("오만원권"+num/50000+"매");
        num %= 50000;
        System.out.println("만원권"+num/10000+"매");
        num %= 10000;
        System.out.println("천원권"+num/1000+"매");
        num %= 1000;
        System.out.println("오백원"+num/500+"매");
        num %= 500;
        System.out.println("백원"+num/100+"매");
        num %= 100;
        System.out.println("오십원"+num/50+"매");
        num %= 50;
        System.out.println("십원"+num/10+"매");
        num %= 10;
        System.out.println("일원"+num+"매");
    }
//    public static void main(String[] args) {
//        int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                System.out.print(n[i][j]);
//            }
//            System.out.println();
//        }
}
