package main.java.JavaBook_2;

/**
 * @ClassName BookCaoZuo
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public interface BookCaoZuo {
   boolean checkHealth(Book book) throws IsbnException,
           BookNameException,PriceException;
}
