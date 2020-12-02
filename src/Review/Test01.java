package Review;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test01 extends JFrame {
    Test01() {
        setTitle("a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JLabel la = new JLabel("Love Java");
        la.setSize(300,300);
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (la.getText().equals("Love Java"))
                            la.setText("avaJ evoL");
                        else
                            la.setText("Love Java");
                        break;
                }
            }
        });
        c.add(la);

        setSize(300,400);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new Test01();
    }
}
