import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Late_Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();
        System.out.println("명지 장학금 관리 시스템입니다. 이름과 학점을 입력하세요.");
        while (true) {
            System.out.print("이름과 학점>> ");
            String name = sc.next();
            if (name.equals("그만"))
                break;
            Double score = sc.nextDouble();
            map.put(name,score);
        }

        System.out.print("장학생 선발 기준을 입력하세요>> ");
        double cutline = sc.nextDouble();
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("장학생 명단: ");
        while(it.hasNext()) {
            String student = it.next();
            double score = map.get(student);
            if (score > cutline)
                System.out.print(student + " ");
        }
    }
}
