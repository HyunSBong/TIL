import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class Point {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int point;
    private int allPoint;
    private int price;
    HashMap<String, Integer> manage = new HashMap<String, Integer>();

    public void saving() {
        while (true) {
            System.out.print("이름과 구매금액 입력>> ");
            name = sc.next();
            if (name.equals("그만"))
                break;
            point = sc.nextInt()/10;
            if (manage.get(name) == null) {
                manage.put(name, point);
            }
            else {
                manage.put(name, manage.get(name)+point);
            }
            Set<String> keys = manage.keySet();
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                String customer = it.next();
                Integer sumPoint = manage.get(customer);
                System.out.print("("+customer+","+sumPoint+")");
            }
            System.out.println();
        }
    }
    public void search() {
        System.out.print("이름>> ");
        name = sc.next();
        allPoint = manage.get(name);
        System.out.println("포인트: "+allPoint);
    }
    public void deduction() {
        System.out.print("이름>> ");
        name = sc.next();
        System.out.print("상품가격>> ");
        price = sc.nextInt();
        System.out.print("실지불액: ");
        allPoint = manage.get(name);
        System.out.println(price-allPoint);
        allPoint = 0;
        manage.put(name, allPoint);
        System.out.println("잔여포인트: "+allPoint);
    }
    public void bestCustomer() {
        Set<String> keys = manage.keySet();
        Iterator<String> it = keys.iterator();
        int max = 0;
        String best = "";
        while (it.hasNext()) {
            String customer = it.next();
            if (manage.get(customer) > max) {
                max = manage.get(customer);
                best = customer;
            }
        }
        System.out.println("최우수고객>> "+best);
    }
}
public class PointManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**포인트 관리 프로그램입니다 **");
        Point point = new Point();
        while (true) {
            System.out.println("**1: 포인트 적립\n**2: 포인트 조회\n**3: 포인트 차감\n**4: 최우수 고객 알림\n**5: 종료");
            System.out.print("** 선택: ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    point.saving();
                    break;
                case 2:
                    point.search();
                    break;
                case 3:
                    point.deduction();
                    break;
                case 4:
                    point.bestCustomer();
                    break;
                case 5:
                    System.out.println("MJ포인트 관리 프로그램 정상 종료");
                    return;
                default:
                    System.out.println("올바르게 입력했는지 확인하세요.");
            }
        }
    }
}
