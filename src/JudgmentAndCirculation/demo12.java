package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 9:46
 * @description: 回文数
 **/
public class demo12 {
    /*需求：给你一个整数x
    如果x是一个回文数，打印true，否则，返回false
    解释：回文数是指正序（从左到右）和倒序（从右向左）读都是一样的整数
    例如，121是回文，而123不是*/
    public static void main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        String initial = sc.next();

        //倒序
        StringBuilder stringBuilder = new StringBuilder(initial);
        stringBuilder.reverse();
        String res = stringBuilder.toString();
        System.out.println("倒序结果为" + res);

        //判断
        if (initial.equals(res)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
