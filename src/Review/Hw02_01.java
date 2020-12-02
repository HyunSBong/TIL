package Review;

import java.util.*;

public class Hw02_01 {
    private Scanner sc = new Scanner(System.in);
    private HashMap<String, Integer> map = new HashMap<>();
    private String name;
    private int point;
    private int price;
    private int allPoint;
    void run() {
        while (true) {
            System.out.print("이름과 구매금액 입력>> ");
            name = sc.next();
            if (name.equals("그만"))
                break;
            price = sc.nextInt();
            point = price/10;

            if (map.get(name) == null)
                map.put(name, point);
            else
                map.put(name, map.get(name)+point);

            Set<String> keys = map.keySet();
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                String cus = it.next();
                Integer sumPoint = map.get(cus);
                System.out.print("("+cus+","+sumPoint+")");
            }
        }
        System.out.println();
    }
    void search() {
        System.out.print("이름>> ");
        name = sc.next();
        allPoint = map.get(name);
        System.out.println("포인트: "+allPoint);
    }
    void minus() {
        System.out.print("이름>> ");
        name = sc.next();
        System.out.print("상품가격>> ");
        price = sc.nextInt();
        allPoint = map.get(name);
        if (allPoint == 0) {
            System.out.println("잔여포인트가 없습니다.");
            return;
        }
        else {
            System.out.print("실지불액: ");
            if ((price-allPoint) <= 0) {
                System.out.println(0);
                allPoint = allPoint - price;
            }
            else {
                System.out.println(price - allPoint);
                allPoint = 0;
            }
            map.put(name, allPoint);
            System.out.println("잔여포인트: " + allPoint);
        }
    }
    void best() {
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        int max = 0;
        String temp = "";
        while (it.hasNext()) {
            String cus = it.next();
            if (map.get(cus) > max) {
                max = map.get(cus);
                temp = cus;
            }
        }
        System.out.println("최우수고객>> " + temp);
    }

    public static void main(String[] args) {
        Hw02_01 hw02 = new Hw02_01();
        Scanner sc = new Scanner(System.in);
        System.out.println("포인트 관리 프로그램입니다.");
        while (true) {
            System.out.println("**1: 포인트 적립\n**2: 포인트 조회\n**3: 포인트 차감\n**4: 최우수 고객 알림\n**5: 종료");
            System.out.print("** 선택: ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    hw02.run();
                    break;
                case 2:
                    hw02.search();
                    break;
                case 3:
                    hw02.minus();
                    break;
                case 4:
                    hw02.best();
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
