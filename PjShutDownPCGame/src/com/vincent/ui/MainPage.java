package PjShutDownPCGame.src.com.vincent.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainPage extends JFrame implements ActionListener {
    JLabel jLabel = new JLabel("Does your wife/husband think u are perfect?");
    JButton yesButton = new JButton("Yes");
    JButton maybeButton = new JButton("Maybe");
    JButton noButton = new JButton("No");

    Boolean flag = false;
    JLabel overConfident = new JLabel("Are you sure?????");
    JButton reconsiderButton = new JButton("Maybe not, I changed my mind");

    public MainPage() {
        initJFrame();
        initImage();
        MainPage.super.setVisible(true);
    }

    private void initImage() {
        this.getContentPane().removeAll();
        if (flag) {
            overConfident.setBounds(5, 10, 100, 30);
            this.getContentPane().add(overConfident);

            reconsiderButton.setBounds(30, 40, 500, 30);
            this.getContentPane().add(reconsiderButton);
            reconsiderButton.addActionListener(this);
        }

        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        jLabel.setBounds(30, 50, 500, 200);
        this.getContentPane().add(jLabel);

        yesButton.setBounds(60, 200, 100, 30);
        this.getContentPane().add(yesButton);
        yesButton.addActionListener(this);

        maybeButton.setBounds(60, 300, 100, 30);
        this.getContentPane().add(maybeButton);

        noButton.setBounds(60, 400, 100, 30);
        this.getContentPane().add(noButton);
        this.getContentPane().repaint();

    }

    private void initJFrame() {
        this.setSize(600, 800);
        this.setTitle("Test your honesty v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == yesButton) {
            try {
                flag = true;
                initImage();
                Runtime.getRuntime().exec("shutdown -s -t 6000");

            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        } else if (obj == reconsiderButton) {
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }
}
