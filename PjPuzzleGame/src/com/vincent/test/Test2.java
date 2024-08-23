package PjPuzzleGame.src.com.vincent.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(603, 680);

        jFrame.setTitle("Sample");

        jFrame.setAlwaysOnTop(true);

        jFrame.setLocationRelativeTo(null);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setLayout(null);

        JButton jButton = new JButton("Click me");
        jButton.setBounds(0, 0, 100, 50);

        //jButton.addActionListener(new MyActionListener());

        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              System.out.println("Click Once");  }
                
            }
        );

        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);

    
    }
}
