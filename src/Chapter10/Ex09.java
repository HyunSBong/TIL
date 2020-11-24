package Chapter10;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex09 extends JFrame {
    private JLabel la  =new JLabel("No Mouse Event");

    Ex09() {
        setTitle("MouseListener 와 MouseMotionListener 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener l = new MyMouseListener();
        c.addMouseListener(l);
        c.addMouseMotionListener(l);

        c.add(la);
        setSize(300, 200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener,MouseMotionListener {
        @Override public void mouseDragged(MouseEvent e) {
            la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
        }
        @Override public void mouseMoved(MouseEvent e) {
            la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");
        }
        @Override public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
        }
        @Override public void mouseEntered(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.CYAN);
        }
        @Override public void mouseExited(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }
        @Override public void mousePressed(MouseEvent e) {
            la.setText("mousePressed ("+e.getX()+","+e.getY()+")");
        }
        @Override public void mouseReleased(MouseEvent e) {
            la.setText("mouseReleased ("+e.getX()+","+e.getY()+")");
        }
    }

    public static void main(String[] args) {
        new Ex09();
    }
}

