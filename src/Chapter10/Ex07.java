package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Ex07 extends JFrame {
    private JLabel la = new JLabel();
    public Ex07() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            Container container = (Container)e.getSource();
            la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");

            if (e.getKeyChar() == '%')
                container.setBackground(Color.YELLOW);
            else if (e.getKeyCode() == KeyEvent.VK_F1)
                container.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new Ex07();
    }
}
