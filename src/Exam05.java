import java.util.Scanner;
import java.util.HashMap;

class Country {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int human;
    private int totalHuman;
    HashMap<String, Integer> manage = new HashMap<String, Integer>();

    public void saving() {
        while (true) {
            System.out.print("나라 이름과 인구를 입력하세요: ");
            name = sc.next();
            if (name.equals("그만"))
                break;
            human = sc.nextInt();
            if (manage.get(name) == null) {
                manage.put(name, human);
            }
        }
    }

    public void search() {
        System.out.print("인구 검색>> ");
        name = sc.next();
        if (name.equals("그만"))
            return;
        else if (manage.get(name) == null) {
            System.out.println(name+"라는 나라는 없습니다.");
        }
        else {
            totalHuman = manage.get(name);
            System.out.println(name + "의 인구는" + totalHuman);
        }
    }
}
public class Exam05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Country c = new Country();
        c.saving();
        c.search();
    }

}