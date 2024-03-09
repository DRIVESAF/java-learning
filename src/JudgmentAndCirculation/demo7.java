package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 16:23
 * @description: 累加
 **/
public class demo7 {
    //    求1-5之间的和

    public static void main(String[] args) {
        //暂存空间
        //变量的作用范围在所属大括号内
        int temp = 0;
//        需要相加的数字
        for (int i = 1; i < 6; i++) {
                temp = i + temp;
            }
        System.out.println(temp);
        }
    }
