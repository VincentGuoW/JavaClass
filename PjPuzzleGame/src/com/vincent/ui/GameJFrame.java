package PjPuzzleGame.src.com.vincent.ui;

import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class GameJFrame extends JFrame {

    int[][] picLocation = new int[4][4];

    public GameJFrame(){
        //Main frame setup
        initJFrame();
        //Menu setup
        initJMenu();
        //Input data
        initData();
        //Load pic
        initImage();

        //frame visible
        GameJFrame.super.setVisible(true);//better use this, much more simple
    }

    private void initData() {
        Random r = new Random();
        int[] picName = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        
        //random the pic location
        for (int i = 0; i < picName.length; i++) {
            int temp = picName[i];
            int random = r.nextInt(picName.length);
            picName[i]=picName[random];
            picName[random]=temp;
        }
        //pic location into double array
        for (int i = 0; i < picName.length; i++) {
            picLocation[i/4][i%4]=picName[i];
        }

    }

    private void initImage() {
       /*
       ImageIcon icon1 = new ImageIcon("C:\\Users\\o_ovi\\Desktop\\Java\\PjPuzzleGame\\image\\Cat1\\output_tile_2_2.jpg");
       JLabel jLabel1 = new JLabel(icon1);
       jLabel1.setBounds(0,0,105,105);
        this.getContentPane().add(jLabel1);
        */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            int num = picLocation[i][j];
            ImageIcon icon = new ImageIcon("C:\\Users\\o_ovi\\Desktop\\Java\\PjPuzzleGame\\image\\Meat\\"+num+".jpg");
            JLabel jLabel = new JLabel(icon);
            jLabel.setBounds(105*j,105*i,105,105);
            this.getContentPane().add(jLabel);
  
            }
            
        }
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
