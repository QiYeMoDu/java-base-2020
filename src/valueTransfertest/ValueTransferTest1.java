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
 * 方法的形参的传递机制：值传递
 *
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 * 如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 *
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m=10;
        data.n=20;
        System.out.println(data.m);
        System.out.println(data.n);

        ValueTransferTest1 valueTransferTest1 = new ValueTransferTest1();
        valueTransferTest1.swap(data);
        System.out.println(data.m);
        System.out.println(data.n);

    }
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
