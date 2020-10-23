package main.java.JavaDay4;

/**
 * @ClassName MyClassTesxt
 * @Description TODO
 * @Author admin
 * @Date 2020/10/23
 **/
public class MyClassTesxt {
        public static void main(String[] args) {
            //首先创建对象
            MyClass obj = new MyClass();
            //然后才能使用没有static关键字的内容
            obj.method();
            //对于静态方法来说，可以通过对向明进行调用，也可以直接通过类名称来调用
            //正确，但不推荐，这种写法在编译之后也会被javac翻译成为"类名称.静态方法名"
            obj.methodStatic();
            //正确，推荐
            MyClass.methodStatic();
            //对于本类当中的静态方法，可以省略类名称
            myMethod();
            //完全等效
            MyClassTesxt.myMethod();
        }

        public static void myMethod() {
            System.out.println("自己的方法!");
        }
}
