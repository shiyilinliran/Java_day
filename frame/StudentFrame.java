package frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author admin
 * @Date 2020/11/7
 **/
public class StudentFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button22;
    private JButton button33;
    private JButton button44;
    private JButton button55;
    private JPanel leftPanel;
    private JTextField NameField1;
    private JButton button66;
    private JTextField WeightField;
    private JLabel reaoutLable;

    public StudentFrame() {
        button66.addActionListener(e -> {
         //点击事件
            System.out.println("click 按钮");
            String text1 = NameField1.getText();
            String text2 = WeightField.getText();
            Book book=Book.builder().bookName(text1).isbm(text2).build();
            BookCaoZuo bookCaoZuo=new BookCaoZuoImp();
            boolean a=false;
            try {
                a =bookCaoZuo.checkHealth(book);
            } catch (IsbnException | BookNameException ee) {
               JOptionPane.showMessageDialog(null,"检查没有通过");
               reaoutLable.setText(book.bookName+"检查没有通过");
            }finally {
                NameField1.setText("");
                WeightField.setText("");
                reaoutLable.setText("");
            }if(a){
                JOptionPane.showMessageDialog(null,"检查完成啦");
                reaoutLable.setText(book.bookName+"检查通过");
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
