package Chapter09;

import javax.swing.*;
import java.awt.*;

public class Exercise01 extends JFrame {
    Exercise01() {
        setTitle("Let's study Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exercise01();
    }
}
