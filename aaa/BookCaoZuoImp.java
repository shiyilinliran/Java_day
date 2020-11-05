package main.java.JavaBook_2;

/**
 * @ClassName BookCaoZuoImp
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class BookCaoZuoImp implements main.java.JavaBook_2.BookCaoZuo {
    @Override
    public boolean checkHealth(Book book) throws
            main.java.JavaBook_2.IsbnException, main.java.JavaBook_2.BookNameException, main.java.JavaBook_2.PriceException {
        if(book.getIsbm().length()!=13){
            throw new main.java.JavaBook_2.IsbnException("ISBN不是13位数字组成!!!");
        }else if("恐怖".contains(book.getBookName())||
                "暴力".contains(book.getBookName())){
            throw new main.java.JavaBook_2.BookNameException("书名中含有恐怖暴力词!!!");
        }else if(book.getPrise()>100){
            throw new main.java.JavaBook_2.PriceException("图书价格超过100元!!!");
        }else
    }
}
