package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex02 extends JFrame {
    Ex02() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener2()); // 액션 이벤트 리스너
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }
    private class MyActionListener2 implements ActionListener { // 내부 클래스의 이벤트 리스너
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton)e.getSource();
            if (btn.getText().equals("Action"))
                btn.setText("액션");
            else
                btn.setText("Action");

            Ex02.this.setTitle(btn.getText()); // JFrame의 setTitle()호출
//            setTitle(btn.getText()); // 위와 동일
        }
    }
    public static void main(String[] args) {
        new Ex02();
    }
}
