package PjPuzzleGame.src.com.vincent.ui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginJFrame extends JFrame implements MouseListener {
    int vCodeDig = 1;
    String verificationCode;

    JLabel userName = new JLabel("User Name: ");
    JTextField userNameInput = new JTextField();
    JLabel passWord = new JLabel("Password: ");
    JPasswordField passwordInput = new JPasswordField();
    JLabel vCode = new JLabel("Verification code: ");
    JTextField vCodeInput = new JTextField();
    JLabel randomVCode = new JLabel();
    JButton logInButton = new JButton("Log In");
    JButton registerButton = new JButton("Register");

    public LoginJFrame() {
        initFrame();
        initData();
        initImage();
        // frame visible
        LoginJFrame.super.setVisible(true);// better use this, much more simple
    }

    private void initImage() {
        this.getContentPane().removeAll();// remove all previous

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

        logInButton.removeMouseListener(this);
        registerButton.removeMouseListener(this);

        logInButton.addMouseListener(this);
        registerButton.addMouseListener(this);

    }

    private void initData() {
        Random r = new Random();
        char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vCodeDig; i++) {
            sb.append(arr[r.nextInt(arr.length - 1)]);
        }
        verificationCode = sb.toString();
        randomVCode.setText(verificationCode);
    }

    private void initFrame() {
        // set size for the frame
        this.setSize(488, 430);
        // set title
        this.setTitle("Puzzle Game Login");
        // set window above everyting.
        this.setAlwaysOnTop(true);
        // set window in center
        this.setLocationRelativeTo(null);
        // set close button
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private boolean loginCheck() {
        if ((vCodeInput.getText().equals(randomVCode.getText()))) {

            String username = userNameInput.getText();
            char[] passChar = passwordInput.getPassword();
            String password = new String(passChar);
            if (accountCheck(username, password)) {
                return true;
            }
        }
        return false;
    }

    private void showJDialog(String content){
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);

        JLabel jLabel = new JLabel(content);
        jLabel.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(jLabel);
        jDialog.setVisible(true);
    }

    private boolean accountCheck(String username, String password) {
        // database file path
        String filePath = "PjPuzzleGame\\database\\UserDataBase.txt";
        // use bufferedReader for data check
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // check each line of the file
            while ((line = br.readLine()) != null) {
                // split parts from each line by ","
                String[] columns = line.split(",");

                if (columns.length == 2) {
                    if (columns[0].toString().equals(username)) {
                        if (columns[1].toString().equals(password)) {
                            return true;
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == logInButton) {
            if (loginCheck()) {
                new GameJFrame();
                this.dispose();
            } else {
                initData();
                initImage();
                showJDialog("WRONG USERNAME OR PASS");
            }
        } else if (obj == registerButton) {
            new RegisterJFrame();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == logInButton) {
            logInButton.setForeground(Color.RED);
        } else if (obj == registerButton) {
            registerButton.setForeground(Color.RED);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == logInButton) {
            logInButton.setForeground(Color.BLACK);
        } else if (obj == registerButton) {
            registerButton.setForeground(Color.BLACK);
        }
    }
}
