package main.java.JavaDay11;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @ClassName ZhenZeBiaoDaShi
 * @Description TODO
 * @Author admin
 * @Date 2020/11/2
 **/
public class ZhenZeBiaoDaShi {
    public static void main(String[] args) {
        String a = "and rianam poinimer ina";
        String b = ".*nd*.";
        String c="add";
        String d="safene23  __ss";
        System.out.println("a中是否包含b" + "   " + Pattern.matches(b, a));
        System.out.println( c.matches("add"));
        /**
         * 删除参数后返回
         */
        System.out.println(Arrays.toString(c.split("a")));
        System.out.println(Arrays.toString(c.split("d")));
        System.out.println(Arrays.toString(d.split("s")));
        /**
         * 替换首次出现字符
         */
        System.out.println(d.replaceFirst("ness"," "));
        System.out.println(a.replaceAll("i",""));
        /**
         * \\s 空格 \\S非空格
         * \\d 数字 \\D非数字
         * \\w 单词+数字+下划线 \\W非
         */
        System.out.println(a.replaceAll("\\S","a"));
        System.out.println(d.replaceAll("\\w","s"));
    }
}
