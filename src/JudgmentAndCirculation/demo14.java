package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 11:06
 * @description: demo14
 **/
public class demo14 {
    /*需求：给定两个整数，被除数(dividend)和除数(divisor，且不超过int的范围
    将两数相除，要求不得使用乘法、除法和 % 运算符
    得到商和余数

    分析：
        被除数 / 除数 = 商 … 余数
    */

    public static void main(String[] args) {
//        定义除数
        int dividend = 10;
       // 定义被除数
        int divisor = 10;
        // 记录商
        int quotient = 0;
        while(dividend >= divisor){
            dividend = dividend - divisor;
            quotient++;
        }
        System.out.println("商：" + quotient);
        System.out.println("余数：" + dividend);
    }
}
