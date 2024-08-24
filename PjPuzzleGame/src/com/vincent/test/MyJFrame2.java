package PjPuzzleGame.src.com.vincent.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame2 extends JFrame implements MouseListener, ActionListener  {
    JButton jButton = new JButton("Click me 1");
    JButton jButton2 = new JButton("Click me 2");
    Random r = new Random();

    public MyJFrame2(){

        this.setSize(603, 680);

        this.setTitle("Sample");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        jButton.setBounds(0, 0, 100, 50);
        jButton.addActionListener(this);
        jButton.addMouseListener(this);

        jButton2.setBounds(400, 0, 100, 50);
        jButton2.addActionListener(this);
        jButton2.addMouseListener(this);

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Now its at action");
       Object source = e.getSource();
       if(source==jButton){
            jButton.setSize(300, 300);
       }else if(source == jButton2){
        jButton2.setLocation(r.nextInt(300),r.nextInt(300));
        System.out.println("action performed done");

       }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLick"); 
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Press"); 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Release"); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered"); 
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited"); 
        Object source = e.getSource();

        if(source==jButton2){
            jButton2.setLocation(r.nextInt(500), r.nextInt(500));
            System.out.println("mouse performed done");

        }
    }
}
