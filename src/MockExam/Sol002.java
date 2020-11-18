package MockExam;

import javax.swing.*;
import java.awt.*;

public class Sol002 extends JFrame {
    Sol002() {
        setTitle("메모 달력 ver 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();
        c.add(pn1, BorderLayout.WEST);
        pn1.add(pn2, BorderLayout.NORTH);
        pn1.add(pn3, BorderLayout.SOUTH);

        JPanel pn4 = new JPanel();
        c.add(pn4, BorderLayout.EAST);

    }
    public static void main(String[] args) {
        new Sol002();
    }
}
