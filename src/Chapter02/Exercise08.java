package Chapter02;
import java.util.Scanner;

public class Exercise08 {
    public static boolean inRect(int x1, int y1, int x2, int y2) {
        if(((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200)) || ((x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200)))
            return true; // 사각형 내에 있는 경우
        else if(((100 >= x1 && 100 < x2) && (200 >= y1 && 200 <= y2)))
            return true; // 사각형이 입력한 좌표 값에 따른 사각형에 포함되는 경우
        else if (((x1 <= 100 && y1 <= 100) && (x2 >= 200 && y2 >= 200)))
            return true; // 사각형을 포함하는 경우
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.print("(x1, y1) 의 값을 입력해 주세요 >>");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("(x2, y2) 의 값을 입력해 주세요 >>");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        boolean a = inRect(x1,y1,x2,y2);
        int x3 = x1;
        int y3 = y2;
        int x4 = x2;
        int y4 = y1;
        boolean b = inRect(x3,y3,x4,y4);

        if(a == true || b == true)  {
            System.out.print("두 사각형은 충돌합니다.");
        }
        else {
            System.out.print("두 사각형은 충돌하지 않습니다.");
        }

        sc.close();
    }

}
