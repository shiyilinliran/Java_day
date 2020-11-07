package frame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @ClassName CheckedExceptionTest
 * @Description TODO
 * @Author admin
 * @Date 2020/11/5
 **/
public class CheckedExceptionTest {
    public static void main(String[] args) {
        //以下两种方法能得到long类型的时间戳
        //System.out.println(new Date().getTime());
        //System.out.println(System.currentTimeMillis());


//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            System.err.println("终端异常");
//        }
        RandomTest();
    }

    public static String formatTimeByDate(long timeStamp) {
        timeStamp = System.currentTimeMillis();
        //转换为yyyy-MM-dd HH：mm：ss格式：两种方法：Date和LocalDataTime
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateformat.format(timeStamp);
        System.out.println(dateStr);

        //LocalDataTime和DataTimeFormat实现
        Instant instant = Instant.ofEpochMilli(timeStamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd " +
                "HH:mm:ss");
        String result = localDateTime.format(formatter);
        return result;
    }

    public static void RandomTest() {
        int s = 0;
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(3000);
                s = new Random().nextInt(10000);
                System.out.println(s);
            } catch (InterruptedException ee) {
                System.err.println("终端异常");
            }
        }
    }
}
