package frame;

import javax.swing.*;
import java.util.Scanner;

/**
 * @ClassName RuntimeExceptionTest
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
          System.out.println(3 / 0);
        } catch (ArithmeticException e) {
           System.err.println("被除数不为0");
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            System.err.println(e);
            e.printStackTrace();
        /**
         * 弹出对话框提示异常
         */
            JOptionPane.showMessageDialog(null,"被除数不为0");
            System.out.println("请输入");
    }
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int result=0;
            try {
                 result=Integer.parseInt(s);
            }catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(null,
                        "输入数据非法，无法转型为整型");
            }finally {
                //应用场景，关闭数据库连接，线程资源的释放，流的关闭
                System.out.println("finish");
                sc.close();
            }
            System.out.println(result);
            /**
             * 数组越界异常处理
             */
            int[] a=new int[5];
            for(int i=0;i<a.length;i++){
                a[i]=i;
            }
            try {
                for(int j=0;j<a.length+1;j++){
                    System.out.println(a[j]);
                }
            }catch (ArrayIndexOutOfBoundsException ee){
                JOptionPane.showMessageDialog(null,"数组越界了！！!");
            }

            String aaa=null;
            if(aaa==null||"".equals(aaa)){
                System.out.println("账号不能为空");
            }

            System.out.println("**********************");
        }
}
