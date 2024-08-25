package PjPuzzleGame.src.com.vincent.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyJFrame3 extends JFrame implements KeyListener  {
    JButton jButton = new JButton("Click me 1");
    JButton jButton2 = new JButton("Click me 2");
    Random r = new Random();

    public MyJFrame3(){

        this.setSize(603, 680);

        this.setTitle("Sample");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);

        //First this => the whole frame
        //(this) => value for keyListener
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      System.out.println("When pressed");
      int code = e.getKeyCode();
      if(code ==65){
        System.out.println("Now pressing letter a");
      }

       }

    @Override
    public void keyReleased(KeyEvent e) {
      System.out.println("When released");
    }

   
}
