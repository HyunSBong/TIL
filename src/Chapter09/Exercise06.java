package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise06 extends JFrame{
    Exercise06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i <20 ; i++) {
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            JLabel jla = new JLabel();
            jla.setLocation(x,y);
            jla.setSize(10,10);
            jla.setOpaque(true);
            jla.setBackground(Color.BLUE);
            c.add(jla);
        }

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise06();
    }
}
