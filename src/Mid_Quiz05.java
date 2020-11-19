import javax.swing.*;
import java.awt.*;

public class Mid_Quiz05 extends JFrame {
    Mid_Quiz05() {
        setTitle("나의 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        try{
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }catch(Exception e){
            e.printStackTrace();
        }

        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JPanel pn3 = new JPanel();
        pn1.setBackground(Color.GRAY);
        pn3.setBackground(Color.YELLOW);

        c.add(pn1, BorderLayout.NORTH);
        c.add(pn2, BorderLayout.CENTER);
        c.add(pn3, BorderLayout.SOUTH);

        GridLayout grid = new GridLayout(4,4);
        pn2.setLayout(grid);
        c.add(pn2);

        JLabel la1 = new JLabel("수식 입력");
        pn1.add(la1);
        JTextField jtx1 = new JTextField(10);
        pn1.add(jtx1);

        JLabel la2 = new JLabel("계산결과");
        pn3.add(la2);
        JTextField jtx2 = new JTextField(10);
        pn3.add(jtx2);

        String [] str = {"CE","계산","+","-","*","/"};

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            pn2.add(btn);
        }
        for (int i = 0; i < str.length; i++) {
            JButton btn = new JButton(str[i]);
            btn.setBackground(Color.CYAN);
            pn2.add(btn);
        }

        setSize(300,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Mid_Quiz05();
    }
}