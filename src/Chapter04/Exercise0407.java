package Chapter04;

import java.util.Scanner;

class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if(work == null)
            System.out.println("없습니다.");
        else
            System.out.println(work+"입니다.");
    }
}
class MonthSchedule {
    private int month;
    private Scanner sc;
    private Day[] day;

    MonthSchedule(int month) {
        this.month = month;
        day = new Day[month];
        for (int i = 0; i < day.length; i++) {
            day[i] = new Day();
        }
        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
            System.out.println();
        }
    }

    public void view() {
        System.out.print("날짜(1~30)?");
        int today = sc.nextInt();
        today--;
        if (today < 0 || today > month) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.print(today + 1 + "일의 할 일은");
        day[today].show();
    }

    public void input() {
        System.out.print("날짜(1~30)?");
        int today = sc.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String work = sc.next();
        today--;
        if (today < 0 || today > month) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        day[today].set(work);
    }

    public void finish() {
        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}
public class Exercise0407 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
