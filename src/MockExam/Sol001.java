package MockExam;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

class Word {
    private String eng;
    private String kor;

    Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    String getEng() {
        return eng;
    }
    String getKor() {
        return kor;
    }
}
class Option {
    int [] optionArr = new int[4];

    void arr(int answer, int size) {
        int r = (int)(Math.random()*4);
        optionArr[r] = answer;
        for (int i = 0; i < 4; i++) {
            int n = (int)(Math.random()*size);
            for (int j = 0; j < 4; j++) {
                if (optionArr[i] == n) {
                    i--;
                    break;
                }
                else
                    optionArr[i] = n;
            }
        }
    }

}
class Quiz {
    private Vector<Word> v = new Vector<Word>();
    public String q;
    public String [] arr = new String[4];

    Quiz() {
        v.add(new Word("cat", "고양이"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("flower", "꽃"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("honey", "애인"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("fault", "오류"));
    }

    void run() {
        Option option = new Option();
        int r = (int) (Math.random() * v.size());
        int num = r;
        String rEng = v.get(num).getEng();
        q = "Quiz1 : " + rEng + " to Korean?";

        int r2 = (int)(Math.random()*4);
        arr[r2] = v.get(num).getKor();
        System.out.println("정답 : " + arr[r2]);

        for (int i = 0; i < 4; i++) {
            int n = (int)(Math.random()*v.size());
            String kor = v.get(n).getKor();
            System.out.println(kor);
            if (kor.equals(arr[r2])) {
                i--;
                break;
            }
            for (int j = 0; j < 4; j++) {
                if (arr[i] == null) {
                    arr[i] = kor;
                }
                else if (arr[i].equals(kor)) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
public class Sol001 extends JFrame {
    Sol001() {
        Quiz quiz = new Quiz();
        quiz.run();

        setTitle("Online Test Of Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();
        pn2.setLayout(new GridLayout(4,1));

        c.add(pn1, BorderLayout.NORTH);
        c.add(pn2);
        c.add(pn3, BorderLayout.SOUTH);

        JLabel lb = new JLabel(quiz.q);
        pn1.add(lb);

        JButton btn1 = new JButton("Next");
        pn3.add(btn1);
        JButton btn2 = new JButton("BookMark");
        pn3.add(btn2);

        for (int i = 0; i < quiz.arr.length; i++) {
            JRadioButton rbtn = new JRadioButton(quiz.arr[i]);
            pn2.add(rbtn);
        }

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sol001();
    }
}
