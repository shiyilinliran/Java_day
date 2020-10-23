package main.java.JavaDay4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName ArrayDemo
 * @Description TODO
 * @Author admin
 * @Date 2020/10/23
 **/
public class ArrayDemo {
        public static void main(String[] args) {
            int[] intArray = {10,20,30};
            //将int[]数组按照默认格式变成字符串
            String[] s={"aaa","aaa","aaa"};
            String intStr = Arrays.toString(intArray);
            System.out.println(intStr);
            System.out.println(Arrays.toString(s));

            //对整形数组排序
            int[] array1 = {4,6,2,5,2,55,33,22};
            Arrays.sort(array1);
            System.out.println(Arrays.toString(array1));

            //对字符串数组排序
            String[] array2 = {"ab","aaa","ccc"};
            Arrays.sort(array2);
            System.out.println(Arrays.toString(array2));

            //将一个随机字符串中的所有字符升序排序，并倒序打印
            String str = "asfsafasfasfasf";
            //如何进行生序排列:sort
            //如果是一个数字，才能用arrays.sort方法
            //String-->数组，用toCharArray
            char[] chars = str.toCharArray();
            //对字符数组进行生序排序
            Arrays.sort(chars);
            //倒序遍历
            for (int i = chars.length-1;i>=0;i--){
                System.out.print(chars[i]+" ");
            }
        }
}
