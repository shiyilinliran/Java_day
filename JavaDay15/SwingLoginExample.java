package JavaDay15;

import javax.swing.*;
import java.time.Period;

/**
 * @ClassName SwingLoginExample
 * @Description TODO
 * @Author admin
 * @Date 2020/11/8
 **/
public class SwingLoginExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("加载实例");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);

    }
    private static void  placeComponents(JPanel panel){
        panel.setLayout(null);
        JLabel userLabel=new JLabel("User:");
        userLabel.setBounds(20,20,100,26);
        panel.add(userLabel);
        JTextField userText=new JTextField(20);
        userText.setBounds(100,20,165,26);
        panel.add(userText);
        JLabel psaaworldLabel=new JLabel("Password:");
        psaaworldLabel.setBounds(10,50,80,25);
        panel.add(psaaworldLabel);
        JPasswordField passwordField=new JPasswordField(20);
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);
        JButton lohinButton=new JButton("lohin");
        lohinButton.setBounds(10,80,80,25);
        panel.add(lohinButton);
    }

}
