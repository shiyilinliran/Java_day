package frame;

/**
 * @ClassName BookCaoZuoImp
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class BookCaoZuoImp implements BookCaoZuo {
    @Override
    public boolean checkHealth(Book book) throws
            IsbnException, BookNameException {
        if(book.getIsbm().length()!=13){
            throw new IsbnException("ISBN不是13位数字组成!!!");
        }else if(book.getBookName().contains("恐怖")||
                book.getBookName().contains("暴力")){
            throw new BookNameException("书名中含有恐怖暴力词!!!");
        }else {
            return true;
        }
    }
}
