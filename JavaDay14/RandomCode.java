package JavaDay14;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

/**
 * @ClassName RandomCode
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class RandomCode {
    private static final int length=4;
    private static final int Bounds=15;
    public static void main(String[] args) throws IOException {
        Random random=new Random();
        int a=random.nextInt(60);
        BufferedImage bufferedImage = new BufferedImage(10000, 4000, BufferedImage.TYPE_INT_RGB);
        Graphics graphics=bufferedImage.getGraphics();
        Font font=new Font("方正华隶简体",Font.BOLD,300);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);
        //开始绘制
        graphics.fillRect(0,0,6000,4000);
        String s ="ABCDEFGHIJKLMNOPQRSTUVWXCYZabcdefghijklmnopqrstuvwxyz1234567890";
        char[] chs = s.toCharArray();
        StringBuilder string = new StringBuilder();
        for (int i = 0;i<length;i++){
            char ch = chs[random.nextInt(60)];
            string.append(ch);
            graphics.setColor(new Color(a,a,a));
            graphics.drawString(string.toString(),100,100);
            string.delete(0,string.length());
        }
        //生成干扰线
        for (int i = 0;i<Bounds;i++){
            //随机坐标
            int x1 = random.nextInt(1200);
            int y1 = random.nextInt(400);
            int x2 = random.nextInt(1200);
            int y2 = random.nextInt(400);
            Color color = new Color(a,a,a);
            graphics.setColor(color);
            graphics.drawLine(x1,y1,x2,y2);
        }
        //输出图片，并指定文件路劲，自己注意修改
        File file = new File("D:\\Gugo_Downloads\\.jpg");
        //获取输入流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();
    }
}