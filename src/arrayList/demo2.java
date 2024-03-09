package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/08 19:49
 * @description: 统计数组元素
 **/
public class demo2 {
    /*定义数组，存储1,2,3,4,5,6,7,8,9,10
    遍历数组得到每个元素，统计数组里面一共有多少个能被3整除的数字*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //计数器
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int number = arr[i];
            if (number % 3 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
