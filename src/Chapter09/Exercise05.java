package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise05 extends JFrame {
    public Exercise05() {
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridLayout grid = new GridLayout(4,4);
        c.setLayout(grid);

        Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK,
                Color.DARK_GRAY, Color.ORANGE, Color.BLUE, Color.MAGENTA};
        for(int i=0; i<16; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setOpaque(true); // 불투명
            btn.setBackground(col[i]);
            c.add(btn);
        }

        setSize(600, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise05();
    }
}
