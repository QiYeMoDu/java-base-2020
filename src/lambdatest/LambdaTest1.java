package lambdatest;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
/*
 * Lambda表达式的使用
 *
 * 1.举例： (o1,o2) -> Integer.compare(o1,o2);
 * 2.格式：
 *      -> :lambda操作符 或 箭头操作符
 *      ->左边：lambda形参列表 （其实就是接口中的抽象方法的形参列表）
 *      ->右边：lambda体 （其实就是重写的抽象方法的方法体）
 *
 * 3. Lambda表达式的使用：（分为6种情况介绍）
 *
 *    总结：
 *    ->左边：lambda形参列表的参数类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
 *    ->右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），省略这一对{}和return关键字
 *
 * 4.Lambda表达式的本质：作为函数式接口的实例
 *
 * 5. 如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口。我们可以在一个接口上使用 @FunctionalInterface 注解，
 *   这样做可以检查它是否是一个函数式接口。
 *
 * 6. 所以以前用匿名实现类表示的现在都可以用Lambda表达式来写。
 * */
public class LambdaTest1 {
    public static void main(String[] args) {
        //语法格式一:无参无返回值
        Runnable hello_lambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        };
        hello_lambda.run();
        System.out.println("*****************************************************");
        Runnable hello_lambda1 = () -> System.out.println("Hello Lambda1");
        hello_lambda1.run();

        //语法格式二:有参数但是没有返回值
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("1");
        System.out.println("*****************************************************");
        Consumer<String> tConsumer = s -> System.out.println(s);
        tConsumer.accept("2");

        //语法格式三:
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听得人当真了，一个是说的人当真了");
        System.out.println("*****************************************************");
        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("一个是听得人当真了，一个是说的人当真了");

        //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略

        //语法格式五:lambda需要两个或以上参数时,多条执行语句,并且可有有返回值
        Comparator<Integer> comparator0=(s,m)->{
            System.out.println(s);
            System.out.println(m);
            return s.compareTo(m);
        };
        System.out.println(comparator0.compare(15, 20));

        //语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    }
}
