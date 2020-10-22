package main.java.JavaDay3;

import java.util.Scanner;

/**
 * @ClassName StringText
 * @Description TODO
 * @Author admin
 * @Date 2020/10/22
 **/
public class StringText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("给a赋值:");
        String a = sc.nextLine();
        System.out.println("给b赋值:");
        String b = sc.nextLine();
        System.out.println("a的值是：" + a);
        System.out.println("b的值是：" + b);
        System.out.println("内容是否相同：" + a.equals(b));
        System.out.println("对象名是否相同" + (a == b));
        System.out.println("忽略大小写比较" + a.equalsIgnoreCase(b));
        String c = a + b;
        System.out.println("ab合并后为"+c);
        System.out.println("请输入要查的字符串");
        String d=sc.nextLine();
        boolean e=c.contains(d);
        System.out.println("c中是否包含d: "+e);
        System.out.println("包含次数为:"+repetitions(c,d));
        System.out.println("请选择是否替换字符(串)：确定(1)/拒绝(2)");
        int f= sc.nextInt();
        switch (f) {
            case 1:
                System.out.print("请输入想要替换的原字符：");
                String g = sc.nextLine();
                System.out.print("请输入你想要替换成的字符：");
                String h = sc.nextLine();
                String z = c.replace(g, h);
                System.out.println("替换前：" + c);
                System.out.println("替换后：" + z);
                break;
            case 2:
                System.out.println("最终的字符串内容为:\n" + c);
                break;
            default:
                System.out.println("该字符(串)有误");
                break;
        }

    }
    public static int repetitions(String c, String d) {
        int count = 0;
        int fromIndex = 0;
        //从from开始找d找到加一
        while ((fromIndex = c.indexOf(d, fromIndex)) != -1) {
            //子串第一次出现的位置+长度=下一次的起始位置
            fromIndex = fromIndex + d.length();
            count++;
        }
        return count;
    }
}
