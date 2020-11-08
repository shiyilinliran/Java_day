package JavaDay15;

import javax.swing.*;
import java.util.jar.JarEntry;

/**
 * @ClassName HelloWOrldSwing
 * @Description TODO
 * @Author admin
 * @Date 2020/11/8
 **/
public class HelloWOrldSwing {
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame=new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Hello World");
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(HelloWOrldSwing::createAndShowGUI);
    }
}
