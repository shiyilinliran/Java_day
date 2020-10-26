package main.java.JavaDay7;

import java.awt.*;
import java.io.*;
import java.sql.SQLOutput;

/**
 * @ClassName FileCopy
 * @Description TODO
 * @Author admin
 * @Date 2020/10/26
 * C:\Users\admin\Desktop\a.jpg
 * D:\JavaDaka\aaa.jpg
 **/
public class FileCopy{
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream(new File("C:\\Users\\admin\\Desktop\\a.jpg"));
        int a= (int) new File("C:\\Users\\admin\\Desktop\\a.jpg").length();
        inputStream.read(new byte[a]);
        OutputStream outputStream=new FileOutputStream(new File("D:\\JavaDaka\\dddd.jpg"));
        outputStream.write(new byte[a]);
        inputStream.close();
        outputStream.close();
    }
}
