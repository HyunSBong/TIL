import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영단어를 입력하세요: ");
        String word = sc.next();
        char[] wordArray = word.toCharArray();
        int n = wordArray.length; // 7
        System.out.print("거꾸로 된 단어는: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(wordArray[n - i]);
        }
    }
}