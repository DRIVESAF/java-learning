package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 15:06
 * @description:if的第三种格式
 **/
public class demo4 {
         /*    商场VIP会员制，根据不同的会员会有不同的折扣：
             假设商品总价为1000
             键盘录入会员等级，并计算出实际支付的价钱
             会员1级：打9折
             会员2级：打8折
             会员3级：打7折
             非会员：不打折，要打也是打骨折*/


    public static void main(String[] args) {
        //1.定义变量记录总价
        int num = 1000;
        //2.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级");
        int rank = sc.nextInt();
        //3.根据级别来计算实际要支付的钱
        if (rank == 1){
            double res = num * 0.9;
            System.out.println("实际支付：" + res);
        } else if (rank == 2) {
            System.out.println("实际支付：" + num * 0.8);
        } else if (rank == 3) {
            System.out.println("实际支付：" + num * 0.7);
        } else if (rank == 0) {
            System.out.println("实际支付" + num);
        } else {
            System.out.println("没有该等级");
        }
    }

}
