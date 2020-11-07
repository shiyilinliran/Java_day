package frame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
      String isbm;
      String bookName;
      int prise;
}
