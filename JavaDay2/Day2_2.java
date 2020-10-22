/**
 * @ClassName Day2_2
 * @Description TODO
 * @Author admin
 * @Date 2020/10/21
 **/
public class Day2_2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 =new String("abc");
        byte[] bytes = {97,98,99,100,101,102};
        String s3 = new String(bytes);
        //String已经重写了Object中的toSting方法
        System.out.println(s3);
        //1代表起始下标，2代表长度
        String s4 = new String(bytes,2,3);
        System.out.println(s4);
        char[] c1 = {'我','是','中','国','人'};
        String s5 = new String(c1);
        System.out.println(s5);
        String s6 = new String(c1,2,2);
        System.out.println(s6);
    }
}
