import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
    private String name;
    private String manage;
    private double grade;
    private String number;

    Student(String name, String manage, String number, double grade) {
        this.name = name;
        this.manage = manage;
        this.number = number;
        this.grade = grade;
    }
    String getName() {
        return name;
    }
    String getManage() {
        return manage;
    }
    String getNumber() {
        return number;
    }
    double getGrade() {
        return grade;
    }
    void find(String name) {
        if (name.equals(this.name))
            System.out.println(this.name+","+this.manage+","+this.number+","+this.grade);
    }
}

public class Exam08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] student = new Student[4];
        ArrayList<Student> arr = new ArrayList<Student>();
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for(int i=0; i<student.length; i++) {
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String manage = st.nextToken().trim();
            String number = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            student[i] = new Student(name, manage, number, grade);
            arr.add(student[i]);
        }
        for (int i = 0; i < student.length; i++) {
            System.out.print(">>");
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("--------------------");
            Student result = arr.get(i);
            System.out.println("이름 : "+result.getName());
            System.out.println("학과 : "+result.getManage());
            System.out.println("학번 : "+result.getNumber());
            System.out.println("학점평균 : "+result.getGrade());
        }
        System.out.println("--------------------");
        while (true) {
            System.out.print("학생이름 >> ");
            String name = sc.next();
            if(name.equals("그만"))
                break;
            for (int i = 0; i < arr.size(); i++) {
                Student result = arr.get(i);
                result.find(name);
            }
        }
    }
}
