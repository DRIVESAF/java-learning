package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 9:03
 * @description: 循环获取部分数据
 **/
public class demo8 {
//    求1-100之间的偶数和
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0){
                num =num + i;
            }
        }
        System.out.println(num);
    }
}
