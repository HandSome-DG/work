import lombok.Data;

import javax.xml.parsers.SAXParserFactory;
import java.util.concurrent.CountDownLatch;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/24 16:05
 * @since 1.0.0
 */
@Data
public class test {

    private static String ajax = "ajax";

    private String name;




    public static void main(String[] args) {

//        test test = new test();
//        System.out.println(test);
//        System.out.println(ajax);

//        切饼
        int num = 10;

        int count = cut(num);

        System.out.println(count);

    }

    private static int cut(int num) {
        int count=1;
        for(int i =0;i<num+1;i++){
            count+=i;
            System.out.println("切第"+i+"次有"+count+"张饼");
        }
        return count;
    }
}
