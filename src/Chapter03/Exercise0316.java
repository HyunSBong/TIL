package Chapter03;
import java.util.Scanner;
public class Exercise0316 {
    public static void main(String[] args) {
        String user;
        String pc;
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        while (true) {
            System.out.print("가위 바위 보!>>");
            user = sc.next();
            if (user.equals("그만"))
                break;
            int n = (int)(Math.random()*3);
            pc = str[n];
            if (user.equals("가위")) {
                if (pc.equals("보")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 이겼습니다.");
                    continue;
                }
                else if (pc.equals("바위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 졌습니다.");
                    continue;
                }
                else if (pc.equals("가위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 비겼습니다.");
                    continue;
                }
            }
            else if (user.equals("바위")) {
                if (pc.equals("보")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 졌습니다.");
                    continue;
                }
                else if (pc.equals("바위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 비겼습니다.");
                    continue;
                }
                else if (pc.equals("가위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 이겼습니다.");
                    continue;
                }
            }
            else if (user.equals("보")) {
                if (pc.equals("보")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 비겼습니다.");
                    continue;
                }
                else if (pc.equals("바위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 사용자가 이겼습니다.");
                    continue;
                }
                else if (pc.equals("가위")) {
                    System.out.println("사용자 = "+user+", 컴퓨터 = "+pc+", 졌습니다.");
                    continue;
                }
            }
        }
        System.out.println("게임을 종료합니다...");
    }
}
