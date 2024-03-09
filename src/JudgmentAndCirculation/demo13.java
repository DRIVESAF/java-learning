package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 10:38
 * @description: 回文数计算版
 **/
public class demo13 {
        /*需求：给你一个整数x
    如果x是一个回文数，打印true，否则，返回false
    解释：回文数是指正序（从左到右）和倒序（从右向左）读都是一样的整数
    例如，121是回文，而123不是*/
        public static void main(String[] args) {
            int x = 123;
//            记录x的值
            int temp = x;
            int num = 0;
            while(x != 0){
                //获取个位数
                int ge = x % 10;
                //把x的个位去掉
                x = x / 10;

                //拼接
                num = num * 10 + ge;
            }
            if (temp == num){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
}
