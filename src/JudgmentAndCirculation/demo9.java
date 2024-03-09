package JudgmentAndCirculation;

import java.util.Scanner;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 9:23
 * @description: 循环统计
 **/
public class demo9 {
    /*    键盘录入两个数字，表示一个范围
        统计这个范围中
        既能被3整除，又能被5整除的数字有多少个*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数字");
        int start = sc.nextInt();
        System.out.println("请输入结束数字");
        int end = sc.nextInt();

        int temp = 0;
        for (int i = start; i < end+1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                temp++;
            }
        }
        System.out.println("既能被3整除又能被5整除的数字有" + temp + "个");
    }
}
