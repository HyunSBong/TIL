package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise08 extends JFrame {
    Exercise08() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();
        pn1.setBackground(Color.GRAY);
        pn2.setLayout(null);
        pn3.setBackground(Color.YELLOW);

        c.add(pn1, BorderLayout.NORTH);
        c.add(pn2);
        c.add(pn3, BorderLayout.SOUTH);

        pn1.add(new JButton("열기"));
        pn1.add(new JButton("닫기"));
        pn1.add(new JButton("나가기"));

        for (int i = 0; i <10 ; i++) {
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            JLabel jla = new JLabel("*");
            jla.setLocation(x,y);
            jla.setForeground(Color.RED);
            jla.setSize(30,30);
            jla.setOpaque(true);
            pn2.add(jla);
        }

        JLabel lb = new JLabel("Word Input");
        pn3.add(lb);
        JTextField tf = new JTextField(20);
        pn3.add(tf);

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise08();
    }
}
