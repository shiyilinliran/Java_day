package main.java.JavaDay8;

/**
 * @ClassName text1
 * @Description TODO
 * @Author admin
 * @Date 2020/10/28
 **/
public class text1 {
    public static void main(String[] args) {
        String s="22.4432521";
        Hd h=new Hd() {
            @Override
            public String handleString(String s) {
                return s.substring(0,s.indexOf("."));
            }
        };
        System.out.println(h.handleString(s));
        Hd h1=new Hd() {
            @Override
            public String handleString(String s) {
                //小数点第四位的值
                int i=s.indexOf(".")+4+1;
                char c=s.charAt(i);
                if(c<='4'){
                    return s.substring(0,i);
                }else {
                    char cc= (char)((int)s.charAt(i)+1);
                    return s.substring(0,i-1)+cc;
                }
            }
        };
        System.out.println(h1.handleString(s));
    }
    interface Hd{
        public abstract String handleString(String s);
    }
}
