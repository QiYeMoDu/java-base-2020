package lambdatest;


import java.util.Comparator;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class LambdaTest {

    public static void main(String[] args) {
        //第一个示例
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        };

        //改造成lambda表达式之后
        Runnable r1=()-> System.out.println("Hello Lambda");
        r1.run();

        //第二个示例
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        //简化
        Comparator<Integer> com0=(s,m)->s.compareTo(m);
        System.out.println(com0.compare(150,210));
        //继续简化
        Comparator<Integer> com=Integer::compareTo;
        System.out.println(com.compare(1150,210));

    }
}
