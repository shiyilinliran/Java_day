package main.java.JavaDay13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author admin
 * @Date 2020/11/4
 **/
public class StringUtil {
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String jionString(List<Object> list, String symbol) {
        StringBuilder result = new StringBuilder();
        if (list != null) {
            for (Object o : list) {
                String temp = o.toString();
                if (temp.trim().length() > 0) {
                    result.append(temp).append(symbol);
                }
            }
            if (result.length() > 1) {
                result = new StringBuilder(result.substring(0, result.length() - 1));
            }
        }
        return result.toString();
    }

    public static String subStringOmit(String subject, int size) {
        if (subject!=null && subject.length() > size){
            subject = subject.substring(0, size) + "...";
        }
        return subject;
    }
    public static String getHidEmailPrefix(String email){
        if(null!=email){
            int index=email.lastIndexOf('@');
            if(index>0){
                email=repeat("*",index).concat(email.substring(index));
            }
        }
        return email;
    }

    private static String repeat(String src, int num) {
           StringBuilder s=new StringBuilder();
           for(int i=0;i<num;i++){
               s.append(src);
           }
           return s.toString();
    }

    public static void main(String[] args) {
        String e="2226780673@qq.com";
        System.out.println(getHidEmailPrefix(e));
        System.out.println(e.lastIndexOf('@'));
        String aa="dsdsds";
        System.out.println(subStringOmit(aa, 2));
        ArrayList<Object> list=new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(scanner.nextLine());
        }
        System.out.println(jionString(list, "*"));
    }
}









