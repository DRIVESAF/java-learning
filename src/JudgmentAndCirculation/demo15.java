package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/07 12:04
 * @description: 跳过某次循环continue
 **/
public class demo15 {
    //跳过第三次循环，然后继续执行
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
