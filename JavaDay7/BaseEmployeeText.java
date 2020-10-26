package main.java.JavaDay7;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @ClassName BaseEmployeeText
 * @Description TODO
 * @Author admin
 * @Date 2020/10/26
 **/
public class BaseEmployeeText {
    @Test
    public void print(){

    }
    @Test
    public void getSalary(){
        BaseEmployee be=new MarketEmployee("admin");
        assertEquals(3000,be.getSalary());
    }
}
