package TestBoard;

import java.util.ArrayList;
import java.util.Scanner;

class Student1{
    private String name, major;
    private int id;
    double score;
    public Student1(String name, String major, int id, double score) {
        this.name = name;
        this.major = major;
        this.id = id;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public int getId() {
        return id;
    }
    public double getScore() {
        return score;
    }
    public String getStudent() {
        String info = name + ", " + major + ", " + id + ", " + score;
        return info;
    }
}

public class ScoreManager {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ArrayList<Student1> l = new ArrayList<>();
        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요. ");
        for(int i=0; i<2; i++) {
            System.out.print(">> ");
            String str = sc.nextLine();
            String[] st = str.split(", ");
            l.add(new Student1(st[0], st[1], Integer.parseInt(st[2]), Double.parseDouble(st[3])));
        }
        System.out.println("------------------------------");
        for(int i=0; i<l.size(); i++) {
            System.out.println("이름:" + l.get(i).getName());
            System.out.println("학과:" + l.get(i).getMajor());
            System.out.println("학번:" + l.get(i).getId());
            System.out.println("학점평균:" + l.get(i).getScore());
            System.out.println("------------------------------");
        }
        while(true) {
            System.out.print("학생 이름>> ");
            String name = sc.next();
            if (name.equals("그만")) {
                break;
            }
            for(int i=0; i<l.size(); i++) {
                if(name.equals(l.get(i).getName())) {
                    System.out.println(l.get(i).getStudent());
                }
            }
        }
        sc.close();
    }
}
