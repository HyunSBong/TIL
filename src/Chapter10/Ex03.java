package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends JFrame {
    Ex03() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // 익명의 액션 리스너
                JButton btn = (JButton)e.getSource();
                if (btn.getText().equals("Action"))
                    btn.setText("액션");
                else
                    btn.setText("Action");

                setTitle(btn.getText());
            }
        });

        setSize(350,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex03();
    }
}
