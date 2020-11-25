package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exercise1006 extends JFrame {
    private JLabel la = new JLabel("C");
    Exercise1006() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        la.setSize(20,20);
        la.setFont(new Font("Arial", Font.PLAIN, 20));
        la.setLocation(100,100);
        c.addMouseListener(new MyMouseAdapter());
        c.add(la);

        setSize(400,400);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    private class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int locX = (int)(Math.random()*370);
            int locY = (int)(Math.random()*370);
            if((e.getX() - la.getX() <= 20) && (e.getY()) - la.getY() <= 20){
                la.setLocation(locX, locY);
            }
        }
    }
    public static void main(String[] args) {
        new Exercise1006();
    }
}
