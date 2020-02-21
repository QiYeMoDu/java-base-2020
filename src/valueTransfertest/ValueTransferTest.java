package valueTransfertest;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
/*
 *
 * 基本类型赋数据值,引用类型赋地址
 *
 * 关于变量的赋值：
 *
 *  如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 *  如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 *
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("基本数据类型:====================");
        int m = 10;
        int n = m;
        System.out.println(m);
        System.out.println(n);
        System.out.println(m + n);

        System.out.println("引用数据类型");
        Order order = new Order();
        order.orderId = 1001;
        Order order1 = order;
        System.out.println(order1.orderId);
        order1.orderId = 1002;
        System.out.println(order.orderId);
    }
}
