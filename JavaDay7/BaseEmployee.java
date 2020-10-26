package main.java.JavaDay7;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author admin
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("这是个抽象类");
    }
    public abstract int getSalary();
}
