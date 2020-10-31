package Chapter03;
import java.util.Scanner;
public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("평균은 " + sum / arr.length);
    }
}

