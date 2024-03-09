package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/07 12:55
 * @description: 求平方根
 **/
public class demo18 {
    /*键盘录入一个大于等于2的整数x，计算并返回x的平方根，结果只保留整数部分，小数部分将被舍去
    * 分析：
    * 10的平方根
    *
    * 1            x
    * ↓            ↓
    * 1 * 1 = 1 < 10
    * 2 * 2 = 4 < 10
    * 3 * 3 = 9 < 10
    * 4 * 4 = 16 > 10
    * 可知10的平方根在3~4之间，小数部分被舍去所以为3
    * */

    public static void main(String[] args) {
        //键盘录入
        int x = 0;
        //记录循环次数
        int time = 0;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个大于等于2的整数");
            x = sc.nextInt();
        }while (x < 2);

        //循环求平方
        for (int i = 1; i < x; i++) {
            //记录每次平方的值
            int square = i * i;
            System.out.println(i);
            //每次循环只要平方根小于 x 就记录一次
            if (square <= x){
                time++;
            }
        }


        System.out.println(x + "的平方根为±" + time);
    }
}
