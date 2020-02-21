package sorttest;

import java.util.Arrays;

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
一言以蔽之:冒泡排序就是两两相比
1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
3.针对所有的元素重复以上的步骤，除了最后一个。
4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
* */
public class BubbleSortTest {
    public static void main(String[] args) {


        int[] arr = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}