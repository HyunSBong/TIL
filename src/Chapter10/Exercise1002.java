package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Exercise1002 extends JFrame {
    Exercise1002() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.addMouseMotionListener(new MyMouseMotionAdapter());
        c.addMouseListener(new MyMouseAdapter());

        setSize(500,500);
        setVisible(true);
    }
    private class MyMouseMotionAdapter extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Component com = (Component)e.getSource();
            com.setBackground(Color.YELLOW);
        }
    }
    private class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mouseReleased(MouseEvent e) {
            Component com = (Component)e.getSource();
            com.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new Exercise1002();
    }
}
