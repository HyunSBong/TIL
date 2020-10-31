package Chapter03;
import java.util.Scanner;
public class Exercise0305 {
    public static void main(String[] args) {
        int n[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 10개를 입력하시오>>");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.print("3의 배수는 ");
        for (int j = 0; j < n.length; j++) {
            if(n[j]%3 == 0)
                System.out.print(n[j]+" ");
        }
    }
}
