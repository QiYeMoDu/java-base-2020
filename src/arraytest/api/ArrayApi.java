package arraytest.api;

import java.util.Arrays;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
public class ArrayApi {
    public static void main(String[] args) {

        //比较两个数组大小是否相等
        int[] arr1 =new int[]{1,2,3,4};
        int[] arr2 =new int[]{1,2,3,4};
        System.out.println(Arrays.equals(arr1, arr2));

        //输出数组信息
        System.out.println(Arrays.toString(arr1));

        //数组排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //使用二分法查找是否包含这个元素
        int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int i = Arrays.binarySearch(arr3, 210);
        if(i>=0){
            System.out.println(i);
        }else {
            System.out.println("没有这元素");
        }


    }
}
