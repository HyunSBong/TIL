package Chapter06;


import java.util.Scanner;
import java.util.Vector;

public class Exercise01 {
    //Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여
    // 가장 큰 수를 출력하는 프로그램을 작성하라.
    public static void Max(Vector<Integer> v) {
        int max = v.get(0);
        for (int i = 0; i < v.size(); i++) {
            if (max < v.get(i))
                max = v.get(i);
        }
        System.out.println("가장 큰 수는 " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer> v = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때까지)>> ");
        while(true) {
            int num = sc.nextInt();
            if (num==-1)
                break;
            v.add(num);
        }
        Max(v);
        sc.close();
    }
}