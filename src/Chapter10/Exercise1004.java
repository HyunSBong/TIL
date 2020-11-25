package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Exercise1004 extends JFrame {
    private JLabel la = new JLabel("Love Java");

    Exercise1004() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyAdapter());

        la.setSize(100,50);
        la.setLocation(100,50);
        c.add(la);

        setSize(300,200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    System.out.println("확인");
                    String str = la.getText();
                    String temp = str.substring(0,1);
                    String temp2 = str.substring(1);
                    str = temp2 + temp;
                    la.setText(str);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Exercise1004();
    }
}
