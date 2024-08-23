package PjPuzzleGame.src.com.vincent.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame extends JFrame implements ActionListener  {
    JButton jButton = new JButton("Click me 1");
    JButton jButton2 = new JButton("Click me 2");
    Random r = new Random();

    public MyJFrame(){

        this.setSize(603, 680);

        this.setTitle("Sample");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        jButton.setBounds(0, 0, 100, 50);
        jButton.addActionListener(this);

        jButton2.setBounds(400, 0, 100, 50);
        jButton2.addActionListener(this);

        this.getContentPane().add(jButton);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
       if(source==jButton){
            jButton.setSize(300, 300);
       }else if(source == jButton2){
        jButton2.setLocation(r.nextInt(500),r.nextInt(500));

       }
    }
}
