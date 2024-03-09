package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/07 12:33
 * @description: 逢七过
 **/
public class demo17 {
    /*游戏规则：从任意一个数字开始报数，当你要报的数是7或者是7的倍数时要说:过
    需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 7的倍数
            if (i % 7 == 0 ){
                System.out.println("过");
                continue;
                // 个位是7
            }else if (i % 10 == 7){
                System.out.println("过");
                continue;
                // 十位是7
            } else if (i / 10 % 10 ==7) {
                System.out.println("过");

                continue;
            }
            System.out.println(i);
        }
    }
}
