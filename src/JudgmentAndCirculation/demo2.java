package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 13:51
 * @description: switch case练习
 **/
public class demo2 {
    //    键盘录入星期数，显示今天的减肥活动
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的星期（如：3）");
        int x = sc.nextInt();
        if (x > 0 && x < 8){
            switch(x){
                case(1):
                    System.out.println("跑步");
                    break;
                case(2):
                    System.out.println("游泳");
                    break;
                case(3):
                    System.out.println("慢走");
                    break;
                case(4):
                    System.out.println("动感单车");
                    break;
                case(5):
                    System.out.println("拳击");
                    break;
                case(6):
                    System.out.println("爬山");
                    break;
                case(7):
                    System.out.println("好好吃一顿");
                    break;
            }
        }else {
            System.out.println("没有这个星期，请重新输入");
        }
    }

}
