import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Late_Exam02 extends JFrame {
    private int count = 0;
    private JLabel la = new JLabel("count = " + count);
    Late_Exam02() {
        setTitle("Counter 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        c.addKeyListener(new MyKeyAdapter());
        la.setLocation(100,100);
        la.setSize(100,50);
        c.add(la);

        setSize(400,400);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    private class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    count++;
                    la.setText("count = " + count);
                    break;
                case KeyEvent.VK_DOWN:
                    count--;
                    la.setText("count = " + count);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Late_Exam02();
    }
}
