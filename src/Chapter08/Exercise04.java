package Chapter08;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Mac 환경이므로 //Library/temp//phone.txt 으로 대체 출력");
        try {
            Scanner fsc = new Scanner(new FileReader("//Library/temp//phone.txt"));
            int num = 1;
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                System.out.printf("%4d", num++); // 행 번호 출력
                System.out.println(": " + line); // 한 행 출력
            }
            fsc.close();
        }
        catch (IOException e) {
            System.out.println("오류 발생");
        }
    }
}
