package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise04 extends JFrame {
    Exercise04() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridLayout grid = new GridLayout(1,10);
        c.setLayout(grid);

        Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
        for(int i=0; i<10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setOpaque(true); // 불투명
            btn.setBackground(col[i]);
            c.add(btn);
        }


        setSize(600, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise04();
    }
}
