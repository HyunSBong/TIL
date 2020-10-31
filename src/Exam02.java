import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] intArray = new int[100];
        int max = 0;
        int s_max = 0;
        int count = 0;
        int target = 0;
        System.out.println("이 프로그램은 주어진 정수 리스트에서 큰 정수 2개를 찾는 프로그램입니다. 한 줄에 하나씩 정수를 입력하고, 프로그램을 종료하고 싶으면 0을 입력하세요.");

        int n;
        while (true) {
            System.out.print("Enter an integer: ");
            n = sc.nextInt();
            if (n == 0)
                break;
            intArray[i] = n;
            count++;

            for (i = 0; i < count; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                    target = i;
                }
            }
        }
        for (int j = 0; j < count; j++) {
            if (j == target)
                continue;
            else if (intArray[j] > s_max) {
                s_max = intArray[j];
            }
        }
        System.out.println("가장 큰 값 :" + max);
        System.out.println("두번째로 큰 값:" + s_max);
    }
}