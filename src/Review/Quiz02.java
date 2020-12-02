package Review;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    String getName() {
        return name;
    }
    int getScore() {
        return score;
    }
}
public class Quiz02 {
    private Scanner sc = new Scanner(System.in);
    private FileReader fr = null;
    private FileWriter fw = null;
    private Vector<Student> v = new Vector<Student>();

    void run() {
        System.out.print("**Java 성적 파일 이름을 입력하세요: ");
        String name = sc.next();

        int c;
        String str;
        try {
            fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);

            while((str = br.readLine()) != null) {
                String arr [] = str.split(" ");
                for (int i = 0; i < v.size(); i++) {
                    v.add(i, new Student(arr[0],Integer.parseInt(arr[1])));
                }
            }
            sort(v);

            System.out.println("**총 " + v.size() + "명의 학생의 Java 성적을 읽었습니다. " );
            for (int i = 0; i < v.size(); i++) {
                System.out.println(v.get(i).getName() + " " + v.get(i).getScore());
            }

            while (true) {
                System.out.print("**학생의 이름을 입력하세요: ");
                String target = sc.next();
                if (target.equals("그만"))
                    break;
                System.out.println(search(v, target));
            }

            fr.close();
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (IOException e) {
            System.out.println("입출력오류");
        }
    }
    static String search(Vector<Student> v, String target) {
        for (int i = 0; i < v.size(); i++) {
            if (target.equals(v.get(i).getName()))
                return (v.get(i).getName()+" "+v.get(i).getScore()+"점 "+(i+1)+"등");
        }
        return ("존재하지 않습니다.");
    }
    void sort(Vector<Student> v) {
        for (int i = 0; i < v.size()-1; i++) {
            int target = v.get(i).getScore();
            for (int j = i+1; j < v.size(); j++) {
                int k = v.get(j).getScore();
                if (target < k) {
                }
            }
        }
    }
    public static void main(String[] args) {
        Quiz02 quiz02 = new Quiz02();
        quiz02.run();
    }
}
