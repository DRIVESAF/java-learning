package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/08 15:33
 * @description: 求质数：标记思想
 **/
public class demo19 {
    /*键盘录入一个正整数x，判断该整数是否为一个指数*/

    public static void main(String[] args) {
        int x;
        // 键盘录入
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个正整数");
            x = sc.nextInt();
        }while (x < 1);

        boolean flag = true;

        for (int i = 2; i < x; i++) {
            //如果在2~x范围内遇到x能整除的其他数，就标记为false
            if (x % i == 0){
                flag = false;
                break;
            }
        }

        if (flag == false){
            System.out.println(x + "不是一个质数");
        }else {
            System.out.println(x + "是一个质数");
        }
    }
}
