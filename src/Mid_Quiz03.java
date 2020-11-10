import java.util.Scanner;
import java.util.Vector;

public class Mid_Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> v1 = new Vector<String>();
        Vector<Integer> v2 = new Vector<Integer>();
        System.out.println("**Java 성적 관리 프로그램**");
        while (true) {
            System.out.println("이름과 성적 입력 >> ");
            String name = sc.next();
            if (name.equals("끝"))
                break;
            int score = sc.nextInt();
            v1.add(name);
            v2.add(score);
        }
        for (int i = 0; i <v1.size() ; i++ ){
            for (int j = i+1; j <v1.size() ; j++ ){
                if (v2.get(j) > v2.get(i)){
                    int container = v2.get(i);
                    v2.remove(i);
                    v2.add(i,v2.get(j));
                    v2.remove(j);
                    v2.add(j,container);

                    String nameContainer = v1.get(i);
                    v1.remove(i);
                    v1.add(i,v1.get(j));
                    v1.remove(j);
                    v1.add(j,nameContainer);
                }
            }
        }
        System.out.println("**Java 성적입니다.");
        double total = v1.size();
        for (int i = 1; i < v1.size()+1; i++) {
            if (i > total*0.9) {
                System.out.println(v1.get(i-1)+" F (100%)");
                continue;
            }
            else if (i > total*0.8) {
                System.out.println(v1.get(i-1)+" D (90%)");
                continue;
            }
            else if (i > total*0.7) {
                System.out.println(v1.get(i-1)+" D (80%)");
                continue;
            }
            else if (i > total*0.6) {
                System.out.println(v1.get(i-1)+" C (70%)");
                continue;
            }
            else if (i > total*0.5) {
                System.out.println(v1.get(i-1)+" C (60%)");
                continue;
            }
            else if (i > total*0.4) {
                System.out.println(v1.get(i-1)+" B (50%)");
                continue;
            }
            else if (i > total*0.3) {
                System.out.println(v1.get(i-1)+" B (40%)");
                continue;
            }
            else if (i > total*0.2) {
                System.out.println(v1.get(i-1)+" B (30%)");
                continue;
            }
            else if (i > total*0.1) {
                System.out.println(v1.get(i-1)+" A (20%)");
                continue;
            }
            else if (i >= 0) {
                System.out.println(v1.get(i-1)+" A (10%)");
                continue;
            }
        }
    }
}