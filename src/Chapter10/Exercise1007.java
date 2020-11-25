package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise1007 extends JFrame {
    private JLabel la = new JLabel("Love Java");
    Exercise1007() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.addMouseWheelListener(new MyMouseWheelListener());
        la.setSize(100,50);
        la.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(la);

        setSize(400,400);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    private class MyMouseWheelListener implements MouseWheelListener {
        public void mouseWheelMoved(MouseWheelEvent e) {
            Font f = la.getFont();
            int size =f.getSize();
            int n = e.getWheelRotation();
            if (n<0)
                la.setFont(new Font("Arial", Font.PLAIN, size-5));
            else
                la.setFont(new Font("Arial", Font.PLAIN, size+5));
        }
    }
    public static void main(String[] args) {
        new Exercise1007();
    }
}
