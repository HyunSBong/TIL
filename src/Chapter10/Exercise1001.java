package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exercise1001 extends JFrame {
    private JLabel la = new JLabel("Love Java");

    Exercise1001() {
        setTitle("마우스 올리기 내리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        la.addMouseListener(new MyMouseAdater());
        la.setSize(100, 50);
        c.add(la);
        setSize(500,500);
        setVisible(true);
    }
    private class MyMouseAdater extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent e) {
            JLabel l = (JLabel)e.getSource();
            l.setText("Love Java");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JLabel l = (JLabel)e.getSource();
            l.setText("사랑해");
        }
    }
    public static void main(String[] args) {
        new Exercise1001();
    }
}
