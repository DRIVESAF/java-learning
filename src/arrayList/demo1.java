package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/08 19:46
 * @description: 遍历数组求和
 **/
public class demo1 {
    /*定义一个数组，存储1,2,3,4,5
    遍历数组得到每一个元素，求数组里面所有的数据和*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int number = 0;

        for (int i = 0; i < 5; i++) {
            number = number + arr[i];
        }

        System.out.println(number);
    }
}
