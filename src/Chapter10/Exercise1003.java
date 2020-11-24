package Chapter10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Exercise1003 extends JFrame{
    private JLabel la = new JLabel("Love Java");

    Exercise1003(){
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        c.addKeyListener(new MyKeyAdapter());

        la.setSize(100,50);
        la.setLocation(100,50);
        c.add(la);

        setSize(300,200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    if (la.getText().equals("Love Java"))
                        la.setText("avaJ evoL");
                    else
                        la.setText("Love Java");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Exercise1003();
    }
}
