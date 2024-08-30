package PjPuzzleGame.src.com.vincent.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame implements MouseListener{
    JLabel userName = new JLabel("User Name: ");
    JTextField userNameInput = new JTextField();
    JLabel passWord = new JLabel("Password: ");
    JPasswordField passwordInput = new JPasswordField();
    JLabel vCode = new JLabel("Verification code: ");
    JTextField vCodeInput = new JTextField();
    JLabel randomVCode = new JLabel(vCodeValue(5));
    JButton logInButton = new JButton("Log In");
    JButton registerButton = new JButton("Register");


    public LoginJFrame(){
        initFrame();
        initData();
        initImage();
        //frame visible
        LoginJFrame.super.setVisible(true);//better use this, much more simple
    }

    private void initImage() {
        
        userName.setBounds(50, 50, 120, 20);
        this.getContentPane().add(userName);

        
        userNameInput.setBounds(180, 50, 100, 20);
        this.getContentPane().add(userNameInput);

      
        passWord.setBounds(50, 100, 120, 20);
        this.getContentPane().add(passWord);

        
        passwordInput.setBounds(180, 100, 100, 20);
        this.getContentPane().add(passwordInput);

        
        vCode.setBounds(50, 150, 120, 20);
        this.getContentPane().add(vCode);

        
        vCodeInput.setBounds(180, 150, 100, 20);
        this.getContentPane().add(vCodeInput);
        
        randomVCode.setBounds(300, 150, 100, 20);
        this.getContentPane().add(randomVCode);
        randomVCode.setForeground(Color.WHITE);

        
        logInButton.setBounds(50, 200, 100, 20);
        this.getContentPane().add(logInButton);

        
        registerButton.setBounds(180, 200, 100, 20);
        this.getContentPane().add(registerButton);

    
        ImageIcon bg = new ImageIcon("PjPuzzleGame\\image\\sport\\main.jpg");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 488, 430);
        this.getContentPane().add(background);

        logInButton.addMouseListener(this);
        registerButton.addMouseListener(this);
    }

    private void initData() {
       
    }

    private void initFrame() {
        //set size for the frame
        this.setSize(488, 430);
        //set title
        this.setTitle("Puzzle Game Login");
        //set window above everyting.
        this.setAlwaysOnTop(true);
        //set window in center
        this.setLocationRelativeTo(null);
        //set close button
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private String vCodeValue(){
        return vCodeValue(5);
    }

    private String vCodeValue(int dig){
        Random r = new Random();
        char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dig; i++) {
            sb.append(arr[r.nextInt(arr.length-1)]);
        }
        String vCode=sb.toString();
        return  vCode;
    }

    private boolean loginCheck(){
        if(vCodeInput.==randomVCode)
    }

    

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object obj = e.getSource();
        if(obj==logInButton){
            loginCheck();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object obj = e.getSource();
        if(obj==logInButton){
            logInButton.setForeground(Color.RED);
        }else if(obj==registerButton){
            registerButton.setForeground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object obj = e.getSource();
        if(obj==logInButton){
            logInButton.setForeground(Color.BLACK);
        }else if(obj==registerButton){
            registerButton.setForeground(Color.BLACK);
        }
    }
}
