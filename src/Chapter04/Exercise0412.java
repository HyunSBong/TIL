package Chapter04;

import java.util.Scanner;

class Concert {
    private String S[];
    private String A[];
    private String B[];
    private Scanner sc;
    Concert() {
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for (int i = 0; i < S.length; i++) {
            S[i] = "___";
            A[i] = "___";
            B[i] = "___";
        }
        sc = new Scanner(System.in);
    }
    public void reservation() {
        while (true) {
            System.out.print("좌석구분 S(1), A(2), B(3) >>");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S);
                    insert(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    insert(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    insert(B);
                    return;
                default:
                    System.out.println("좌석 선택이 잘못되었습니다.");
            }
        }
    }
    public void printSeat(String seatName[]) {
        for (int i = 0; i < seatName.length; i++) {
            System.out.print(" "+seatName[i]+" " );
        }
        System.out.println();
    }
    public void allPrint() {
        System.out.print("S>>");
        printSeat(S);
        System.out.print("A>>");
        printSeat(A);
        System.out.print("B>>");
        printSeat(B);
    }
    public void insert(String seatName[]) {
        System.out.print("이름>>");
        String name = sc.next();
        while (true) {
            System.out.print("번호>>");
            int num = sc.nextInt();
            num--;
            if (seatName[num].equals("___")) {
                seatName[num] = name;
                break;
            }
            else {
                System.out.println("다른 좌석을 선택하세요");
            }
        }
    }
    public void search() {
        allPrint();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void cancel() {
        while (true) {
            System.out.print("좌석 S:1, A:2, B:3 >>");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S);
                    delete(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    delete(S);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    delete(S);
                    return;
                default:
                    System.out.println("좌석 선택이 잘못되었습니다.");
            }
        }
    }
    public void delete(String seatName[]) {
        while (true) {
            System.out.print("이름>>");
            String name = sc.next();
            System.out.print("번호>>");
            int num = sc.nextInt();
            num--;
            if (seatName[num].equals(name)) {
                seatName[num] = "___";
                break;
            }
            else {
                System.out.println("올바르게 입력했는지 확인하세요.");
            }
        }
    }
}
public class Exercise0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert concert = new Concert();
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    concert.reservation();
                    break;
                case 2:
                    concert.search();
                    break;
                case 3:
                    concert.cancel();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("올바르게 입력했는지 확인하세요.");
            }
        }
    }
}