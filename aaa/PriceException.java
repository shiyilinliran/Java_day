package main.java.JavaBook_2;

/**
 * @ClassName PriceException
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class PriceException extends Exception{
    public PriceException(String price) {
        super(String.valueOf(price));
    }
}
