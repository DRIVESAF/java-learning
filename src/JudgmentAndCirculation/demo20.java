package JudgmentAndCirculation;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/08 16:05
 * @description: 猜数字
 **/
public class demo20 {
    /*随机生成一个1-100之间的随机数，使用程序实现猜出这个数字是多少
    * 新增需求：保底机制
    * 猜3次猜不中直接提示猜中了
    * */
    public static void main(String[] args) {
        //随机生成一个数字
        Random r = new Random();
        int num = r.nextInt(1,100);
        int x;

        //计数器思想
        int count = 0;

        do {
            //键盘录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜出的数字");
            x = sc.nextInt();

            //保底机制
            count ++;
            if (count == 3){
                System.out.println("恭喜你，猜中了！");
                break;
            }
            //判断
            if (x > num){
                System.out.println("猜出的数字太大了");
            }else if (x < num){
                System.out.println("猜出的数字太小了");
            }else if (x == num){
                System.out.println("恭喜你，猜对了！");
            }
        }while(x != num);
    }

}
