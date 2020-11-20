package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener { // 독립된 이벤트 리스너
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        if (btn.getText().equals("Action"))
            btn.setText("액션");
        else
            btn.setText("Action");
    }
}
public class Ex01 extends JFrame {
    Ex01() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // 액션 이벤트 리스너
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex01();
    }
}