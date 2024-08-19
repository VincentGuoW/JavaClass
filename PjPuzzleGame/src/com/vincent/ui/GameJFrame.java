package PjPuzzleGame.src.com.vincent.ui;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        //Main frame setup
        initJFrame();
        //Menu setup
        initJMenu();
        //Load pic
        initImage();

        //frame visible
        GameJFrame.super.setVisible(true);//better use this, much more simple
    }

    private void initImage() {
       ImageIcon icon1 = new ImageIcon("C:\\Users\\o_ovi\\Desktop\\Java\\PjPuzzleGame\\image\\Cat1\\output_tile_2_2.jpg");
       JLabel jLabel1 = new JLabel(icon1);
       jLabel1.setBounds(0,0,105,105);
        this.getContentPane().add(jLabel1);
    }

    private void initJMenu() {
        //Menu
        //Set JMenuBar
        JMenuBar jMenuBar = new JMenuBar();

        //Set JMenu
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutUsJMenu = new JMenu("About us");

        //Set JMenuItem
        JMenuItem reStartItem = new JMenuItem("Restart");
        JMenuItem reLoginItem = new JMenuItem("Relogin");
        JMenuItem closeItem = new JMenuItem("Close Game");

        JMenuItem accountItem = new JMenuItem("About US");

        //Add into functionMenu
        functionJMenu.add(reStartItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        //Add into about us menu
        aboutUsJMenu.add(accountItem);

        //Add menu into menu bar
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutUsJMenu);

        //Add  menu bar into frame;
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //set size for the frame
        this.setSize(603, 680);
        //set title
        this.setTitle("puzzle game v1.0");
        //Frame window above everything.
        this.setAlwaysOnTop(true);
        //Frame window shows in middle of the screen.
        this.setLocationRelativeTo(null);
        //Close button: Just close window or show down the whole software
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//interface for setDef...
        //setLayout => null; so pic wont show in center, then able to change place
        this.setLayout(null);
    }
}
