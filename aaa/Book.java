package main.java.JavaBook_2;

/**
 * @ClassName Book
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class Book {
      String isbm;
      String bookName;
      int prise;

    public Book(String isbm, String bookName, int prise) {
        this.isbm = isbm;
        this.bookName = bookName;
        this.prise = prise;
    }

    public String getIsbm(){
        return this.isbm;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPrise(){
        return this.prise;
    }
}
