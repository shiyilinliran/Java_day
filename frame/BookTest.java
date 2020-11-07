package frame;

/**
 * @ClassName BookTest
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class BookTest {
    public static void main(String[] args) {
        Book a = Book.builder().bookName("hanhan").isbm("10101010101").prise(111).build();
        Book book1 = new Book("1111111111111", "天喜", 88);
        Book book2 = new Book("1111111111112", "恐怖", 82);
        Book book3 = new Book("1111111111111", "JAVA程序设计很暴力", 111);
        BookCaoZuo bookCaoZuo = (BookCaoZuo) new BookCaoZuoImp();
        boolean b = false;
        try {
            b = bookCaoZuo.checkHealth(book3);
        } catch (IsbnException | BookNameException  e) {
            System.err.println(e.getMessage());
        }
        System.out.println(b);

    }
}
