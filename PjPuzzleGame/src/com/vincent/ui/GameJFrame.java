package PjPuzzleGame.src.com.vincent.ui;

import javax.swing.JFrame;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //set size for the frame
        this.setSize(603, 680);

        //set title
        this.setTitle("puzzle game v1.0");

        //set location of the frame
        this.isAlwaysOnTop();

        //frame visible
        GameJFrame.super.setVisible(true);//better use this, much more simple
    }
}
