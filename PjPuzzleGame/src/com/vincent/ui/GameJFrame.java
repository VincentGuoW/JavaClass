package PjPuzzleGame.src.com.vincent.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.http.WebSocket.Listener;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener   {

    int[][] picLocation = new int[4][4];
    int xlocation;
    int ylocation;
    String path = "PjPuzzleGame\\image\\Meat\\";
    int[][] win = new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0},
    };

    public GameJFrame() {
        // Main frame setup
        initJFrame();
        // Menu setup
        initJMenu();
        // Input data
        initData();
        // Load pic
        initImage();

        // frame visible
        GameJFrame.super.setVisible(true);// better use this, much more simple
    }

    private void initData() {
        Random r = new Random();
        int[] picName = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0 };

        // random the pic location
        for (int i = 0; i < picName.length; i++) {
            int temp = picName[i];
            int random = r.nextInt(picName.length);
            picName[i] = picName[random];
            picName[random] = temp;
        }
        // pic location into double array
        for (int i = 0; i < picName.length; i++) {
            picLocation[i / 4][i % 4] = picName[i];
            if(picName[i]==0){
                xlocation=i/4;
                ylocation=i%4;
            }
        }

    }

    private void initImage() {
        /*
         * ImageIcon icon1 = new ImageIcon(
         * "C:\\Users\\o_ovi\\Desktop\\Java\\PjPuzzleGame\\image\\Cat1\\output_tile_2_2.jpg"
         * );
         * JLabel jLabel1 = new JLabel(icon1);
         * jLabel1.setBounds(0,0,105,105);
         * this.getContentPane().add(jLabel1);
         */
        this.getContentPane().removeAll();//remove all previous

        if(victory()){
            JLabel jLabel = new JLabel(new  ImageIcon("PjPuzzleGame\\image\\sport\\Win.png"));
            jLabel.setBounds(183, 243, 130, 130);
            this.getContentPane().add(jLabel);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = picLocation[i][j];                                                        
                ImageIcon icon = new ImageIcon( path + num + ".jpg");
                JLabel jLabel = new JLabel(icon);
                jLabel.setBounds(105 * j + 83, 105 * i + 143, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                this.getContentPane().add(jLabel);
            }
        }

        ImageIcon bg = new ImageIcon("PjPuzzleGame\\image\\sport\\main.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);
        this.getContentPane().repaint();

    }

    private void initJMenu() {
        // Menu
        // Set JMenuBar
        JMenuBar jMenuBar = new JMenuBar();

        // Set JMenu
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutUsJMenu = new JMenu("About us");

        // Set JMenuItem
        JMenuItem reStartItem = new JMenuItem("Restart");
        JMenuItem reLoginItem = new JMenuItem("Relogin");
        JMenuItem closeItem = new JMenuItem("Close Game");

        JMenuItem accountItem = new JMenuItem("About US");

        // Add into functionMenu
        functionJMenu.add(reStartItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        // Add into about us menu
        aboutUsJMenu.add(accountItem);

        // Add menu into menu bar
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutUsJMenu);

        // Add menu bar into frame;
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        // set size for the frame
        this.setSize(603, 680);
        // set title
        this.setTitle("puzzle game v1.0");
        // Frame window above everything.
        this.setAlwaysOnTop(true);
        // Frame window shows in middle of the screen.
        this.setLocationRelativeTo(null);
        // Close button: Just close window or show down the whole software
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// interface for setDef...
        // setLayout => null; so pic wont show in center, then able to change place
        this.setLayout(null);

        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
     }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code==65){
            //Think about clear everything and redo it.
            System.out.println("Pressing A");
            this.getContentPane().removeAll();
            JLabel jLabel = new JLabel(new ImageIcon(path + "main.jpg"));
            jLabel.setBounds(83,134,420,420);
            this.getContentPane().add(jLabel);
            ImageIcon bg = new ImageIcon("PjPuzzleGame\\image\\sport\\main.jpg");
            JLabel background = new JLabel(bg);
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //System.out.println(code); test the code I click.

        if(code==37){
            System.out.println("LEFT");
            if(ylocation==3){
                return; 
            }
            picLocation[xlocation][ylocation]=picLocation[xlocation][ylocation+1];
            picLocation[xlocation][ylocation+1]=0;
            ylocation++;
            initImage();
        }else if(code==38){
            System.out.println("UP");
            if(xlocation==3){
                return; 
            }
            picLocation[xlocation][ylocation]=picLocation[xlocation+1][ylocation];
            picLocation[xlocation+1][ylocation]=0;
            xlocation++;
            initImage();

        }else if(code==39){
            System.out.println("RIGHT");
            if(ylocation==0){
                return; 
            }
            picLocation[xlocation][ylocation]=picLocation[xlocation][ylocation-1];
            picLocation[xlocation][ylocation-1]=0;
            ylocation--;
            initImage();
        }else if(code==40){
            System.out.println("DOWN");
            if(xlocation==0){
                return; 
            }
            picLocation[xlocation][ylocation]=picLocation[xlocation-1][ylocation];
            picLocation[xlocation-1][ylocation]=0;
            xlocation--;
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            picLocation=win;
            initImage();
        }
     }

    public boolean victory(){
        for (int i = 0; i < picLocation.length; i++) {
            for (int j = 0; j < picLocation[i].length; j++) {
                if(picLocation[i][j]!=win[i][j]){
                    return false;
                }
            }    
        }
        return true;
    }
    
}
