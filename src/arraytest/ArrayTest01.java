package arraytest;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int num;
        int num01 =10;

        int ids[] = new int[]{1,2,3,4,5};

        String[] names=new String[6];
        names[0]="0";
        names[1]="1";
        names[2]="2";
        names[3]="3";
        names[4]="4";
        names[5]="5";

        System.out.println(ids.length);
        System.out.println(names.length);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
