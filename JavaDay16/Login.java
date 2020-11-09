package JavaDay16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Login
 * @Description TODO
 * @Author admin
 * @Date 2020/11/9
 **/
public class Login {

    private JPanel A1;
    private JPanel A2;
    private JPanel A3;
    private JLabel L1;
    private JLabel L2;
    private JLabel L3;
    private JTextField textField1;
    private JButton button1;
    private JPasswordField passwordField1;

    public Login() {
        button1.addActionListener(e -> {
             if("sylll".equals(textField1.getText())&&"sylllll".equals(passwordField1.getText())){
                 JOptionPane.showMessageDialog(null,"登录成功");
             }else{
                 JOptionPane.showMessageDialog(null,"登录失败");
             }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().A1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
