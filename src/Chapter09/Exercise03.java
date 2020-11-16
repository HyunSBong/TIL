package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise03 extends JFrame {
    Exercise03() {
        setTitle("Ten Color Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridLayout grid = new GridLayout(1,10);
        c.setLayout(grid);
        for (int i = 0; i < 10; i++) {
            c.add(new JButton(Integer.toString(i)));
        }
        setSize(600, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise03();
    }
}
