package arrayList;

import java.util.Random;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/09 15:42
 * @description: 数组求平均数
 **/
public class demo6 {
    /*需求：生成10个1~100之间的随机数存入数组
    1）求出所有数据的和
    2）求所有数据的平均数
    3）统计有多少个数据比平均值小*/

    public static void main(String[] args) {
        // 生成随机数组
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int num = r.nextInt(1,100);
            arr[i] = num;
        }

        // 打印随机数组
        System.out.print("随机生成的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 求平均值
        double num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i];
        }
        double average = num / 10;

        System.out.println("总数：" + num);
        System.out.println("平均数：" + average);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average){
                count++;
            }
        }

        System.out.println("比平均数小的数的个数：" + count);
    }


}
