package Chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListeners implements ActionListener { // 독립된 이벤트 리스너
    private String msg;
    public MyActionListeners(String msg) {
        this.msg = msg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(msg);
    }
}
public class Test01 extends JFrame {
    Test01() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListeners("1"));
        btn.addActionListener(new MyActionListeners("2"));
        btn.addActionListener(new MyActionListeners("3"));
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test01();
    }
}