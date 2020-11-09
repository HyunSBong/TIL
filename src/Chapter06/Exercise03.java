package Chapter06;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise03 {
    /* "그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고,
    다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 다음 해시맵을 이용하라. */
    public static void main(String[] args) {
        HashMap<String, Integer> arr = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요.(예:Korea 5000");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String name = sc.next();
            if (name.equals("그만"))
                break;
            int num = sc.nextInt();
            arr.put(name, num);
        }
        while (true) {
            System.out.print("인구 검색 >> ");
            String name = sc.next();
            if (name.equals("그만"))
                break;
            Integer num = arr.get(name);
            if (num==null)
                System.out.println(name+" 나라는 없습니다.");
            else
                System.out.println(name+"의 인구는 "+num);
        }
    }
}
