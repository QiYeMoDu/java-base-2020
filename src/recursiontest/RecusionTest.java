package recursiontest;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class RecusionTest {
    public static void main(String[] args) {
        int sum = getSum(3);
        System.out.println(sum);
        System.out.println(getSum1(3));
        System.out.println(f(10));
    }

    //计算1-n之间所有自然数的和
    static int getSum(int s) {
        if (s == 1) {
            //此路就结束了
            return 1;
        } else {
            //此路就会一直计算一直走到,最后走到1,此时的表达式为s+getSum(1)=>s+1
            return s + getSum(s - 1);
        }
    }

    //计算1-n之间所有自然数的乘积:n!
    static int getSum1(int s) {
        if (s == 1) {
            return 1;
        } else {
            return s = s * getSum1(s - 1);
        }
    }

    //已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    static int f(int s) {
        if (s == 0) {
            return 1;
        } else if (s == 1) {
            return 4;
        } else {
            return 2 * f(s - 1) + f(s - 2);
        }
    }

    /*
    //这个是错误的,它永远也到不了终点,只会往上增加
    static int f1(int s) {
        if (s == 0) {
            return 1;
        } else if (s == 1) {
            return 4;
        } else {
            return 2 * f1(s + 1) + f1(s + 2);
        }
      }*/
}

