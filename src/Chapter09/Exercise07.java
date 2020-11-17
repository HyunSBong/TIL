package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise07 extends JFrame {
    Exercise07() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();
        pn1.setBackground(Color.GRAY);
        pn2.setLayout(new GridLayout(4,4));
        pn3.setBackground(Color.YELLOW);

        c.add(pn1, BorderLayout.NORTH);
        c.add(pn2);
        c.add(pn3, BorderLayout.SOUTH);

        JLabel lb = new JLabel("수식입력");
        pn1.add(lb);
        JTextField tf = new JTextField(20);
        pn1.add(tf);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            pn2.add(btn);
        }
        String [] arr = {"CE","계산","+","-","x","/"};
        for (int i = 0; i < arr.length; i++) {
            JButton btn = new JButton(arr[i]);
            if (i>=2) {
                btn.setOpaque(true); // 불투명
                btn.setBorderPainted(false); // Border의 외곽선 채우기 설정
                btn.setContentAreaFilled(true); // 버튼 내용 영역 채우기 설정
                btn.setFocusPainted(true); // 버튼이 선택되었을 때의 테두리 설정
                btn.setBackground(Color.CYAN);
            }
            pn2.add(btn);
        }

        JLabel lb2 = new JLabel("계산결과");
        pn3.add(lb2);
        JTextField tf2 = new JTextField(20);
        pn3.add(tf2);

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise07();
    }
}
