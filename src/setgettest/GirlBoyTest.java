package setgettest;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
/*
 * 只用属性私有private的时候才会使用get/set方法
 * */
public class GirlBoyTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setAge(15);
        girl.setName("西施");
        Girl gir2 = new Girl();
        girl.setAge(17);
        girl.setName("杨贵妃");
        if (gir2.getAge() > girl.getAge()) {
            System.out.println(gir2.getName() + "da");
        } else if (gir2.getAge() == girl.getAge()) {
            System.out.println(gir2.getName() + "yiyangda");
        } else {
            System.out.println(girl.getName() + "da");
        }
    }
}
