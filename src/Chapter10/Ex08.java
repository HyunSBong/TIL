package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Ex08 extends JFrame {
    private final int FLYING_UNIT = 10;
    private JLabel la = new JLabel("HELLO");

    public Ex08() {
        setTitle("상하좌우키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        la.setLocation(50,50);
        la.setSize(100,20);
        c.add(la);

        setSize(300,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();

//        c.addMouseListener(new MouseAdapter() {
//            @Override // 포커스를 잃었을 경우 수동으로 클릭해 다시 포커스를 얻게하기 위함
//            public void mouseClicked(MouseEvent e) {
//                Component com = (Component)e.getSource();
//                // 마우스가 클릭된 컴포넌트
//                com.setFocusable(true);
//                com.requestFocus(); // 포커스 설정
//            }
//        });
    }
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            switch (keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(),la.getY()-FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(),la.getY()+FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX()-FLYING_UNIT,la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX()+FLYING_UNIT,la.getY());
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Ex08();
    }
}
