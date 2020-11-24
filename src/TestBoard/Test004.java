package TestBoard;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

class Atm {
    private File f = new File("customerList.txt");
    private Vector<String> v1 = new Vector<String>();
    private Vector<Integer> v2 = new Vector<Integer>();
    private BufferedReader br = null;
    private FileWriter fr = null;
    Scanner sc = new Scanner(System.in);
    private int num;

    void init() {
        System.out.println("회원확인 시스템");
        try {
            fr = new FileWriter(f);
            System.out.println("고객명을 입력해주세요.");
            String name = sc.next();
            for (int i = 0; i < v1.size(); i++) {
                if (name.equals(v1.get(i))) {
                    num = i;
                    return;
                }
            }
            v1.add(name);
        }
        catch (IOException e ) {
            System.out.println("입출력오류");
        }
        menu();
    }

    void menu() {
        System.out.println("어서오십시오. 수행할 작업을 선택하십시오.");
        System.out.println("1. 예금조회 2. 예금 출금, 3.예금 입금, 4. 종료");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                search();
            case 2:
                pull();
            case 3:
                put();
            case 4:
                System.exit(-1);
            default:
        }
    }
    void put() {
        try {
            System.out.println("입금하실 금액을 입력하십시오.");
            int money = sc.nextInt();
            try {
                if (v2.get(num) == null)
                    System.out.println();
                else {
                    int n = v2.get(num);
                    v2.set(num, n+money);
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                v2.add(money);
            }
            fr.write(v1.get(num) + "\t입금 " + money + "\t잔액 " + v2.get(num));
            System.out.println("-------------" + money + "원이 정상 입금되었습니다.------------");
            System.out.println(v1.get(num) + "\t입금 " + money + "\t잔액 " + v2.get(num));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        while (true) {
            System.out.println("계속 진행하시겠습니까? Y/N");
            String s = sc.next();
            if (s.equals("Y")) {
                menu();
            }
            else if (s.equals("N")) {
                System.exit(-1);
            }
            else
                System.out.println("잘못된 접근입니다.");
        }
    }
    void pull() {
        try {
            System.out.println("출금하실 금액을 입력하십시오.");
            int money = sc.nextInt();
            try {
                if (v2.get(num) == null) {
                    System.out.println("잔액이 부족합니다.");
                }
                else {
                    int n = v2.get(num);
                    if (money > n) {
                        System.out.println("잔액이 부족합니다.");
                        return;
                    }
                    v2.set(num, n-money);
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잔액이 부족합니다.");
                menu();
            }
            fr.write(v1.get(num) + "\t출금 " + money + "\t잔액 " + v2.get(num));
            System.out.println("-------------" + money + "원이 정상 출금되었습니다.------------");
            System.out.println(v1.get(num) + "\t출금 " + money + "\t잔액 " + v2.get(num));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        while (true) {
            System.out.println("계속 진행하시겠습니까? Y/N");
            String s = sc.next();
            if (s.equals("Y")) {
                menu();
            }
            else if (s.equals("N")) {
                System.exit(-1);
            }
            else
                System.out.println("잘못된 접근입니다.");
        }
    }
    void search() {
        try {
            if (v2.get(num) == null) {
                System.out.println();
            }
            else {
                System.out.println(v1.get(num) + "\t 잔액 " + v2.get(num));
                menu();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("거래내역이 없습니다.");
            menu();
        }
    }
}
public class Test004 {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.init();
    }
}
