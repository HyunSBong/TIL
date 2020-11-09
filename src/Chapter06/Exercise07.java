package Chapter06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercise07 {
    /*이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고, 장학생 선발 기준을 입력 받아 장학생 명단을 출력하라.
     */
    public static void main(String[] args) {
        HashMap<String, Double> sys = new HashMap<String, Double>();
        System.out.println("미래장학금관리시스템입니다.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>>");
            String name = sc.next();
            double score = sc.nextDouble();
            sys.put(name, score);
        }
        System.out.print("장학생 선발 기준 입력>> ");
        double standard = sc.nextDouble();
        Set<String> set = sys.keySet();
        Iterator<String> it = set.iterator();
        System.out.print("장학생 명단 : ");
        while(it.hasNext()) {
            String name = it.next();
            double score = sys.get(name);
            if(score>standard)
                System.out.print(name + " ");
        }
    }
}
