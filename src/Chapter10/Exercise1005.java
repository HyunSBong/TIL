package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Exercise1005 extends JFrame {
    private JLabel la = new JLabel("Love Java");

    Exercise1005() {
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyAdapter());
        la.setSize(100,50);
        la.setFont(new Font("Arial", Font.PLAIN, 10));
        c.add(la);

        setSize(400,400);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            Font font = la.getFont();
            int size = font.getSize();
//            System.out.println(keyCode); // 키코드 확인용도
            switch (keyCode) {
                case 61: // +키
                        la.setFont(new Font("Arial", Font.PLAIN, size+5));
                        break;
                case 45: // -키
                    if (size > 5) {
                        la.setFont(new Font("Arial", Font.PLAIN, size-5));
                        break;
                    }
            }
        }
    }
    public static void main(String[] args) {
        new Exercise1005();
    }
}
