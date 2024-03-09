package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/06 9:30
 * @description: while
 **/
public class demo10 {
    /*需求：利用while循环打印1—100
    分析：
    开始条件：1
    结束条件：100*/
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        while(start <= end){
            System.out.println(start);
            start++;
        }
    }
}
