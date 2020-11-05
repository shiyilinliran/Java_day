package JavaBook_2;

import main.java.JavaBook_2.Book;
import main.java.JavaBook_2.BookCaoZuo;
import main.java.JavaBook_2.BookCaoZuoImp;
import main.java.JavaBook_2.BookNameException;
import main.java.JavaBook_2.IsbnException;
import main.java.JavaBook_2.PriceException;

/**
 * @ClassName BookTest
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class BookTest {
    public static void main(String[] args) {
        Book book1=new Book("1111111111111","天喜",88);
        Book book2=new Book("1111111111112","天喜恐怖",82);
        Book book3=new Book("11111111111113","JAVA程序设计",111);
        BookCaoZuo bookCaoZuo= (BookCaoZuo) new BookCaoZuoImp();
        boolean b=false;
        try {
            b=bookCaoZuo.checkHealth(book3);
        }catch (IsbnException| BookNameException | PriceException e){
            System.err.println(e.getMessage());
        }
        System.out.println(b);

    }
}
