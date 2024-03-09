package arrayList;

import java.util.Random;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/09 17:00
 * @description: 打乱数组中的数据
 **/
public class demo8 {
    /*定义一个数组，存入1~5.要求打乱数组中所有数据的顺序*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        int x = r.nextInt(0, arr.length);
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }
        System.out.print("打乱后的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
