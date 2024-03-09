package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/07 12:07
 * @description: 循环终止break
 **/
public class demo16 {
    //第三次循环之后不再执行
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i > 3){
                break;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
