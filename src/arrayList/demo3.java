package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/08 19:53
 * @description: 数组赋值
 **/
public class demo3 {
    /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
    遍历数组得到每个元素
    要求：如果是奇数，则将当前数字扩大两倍
    如果是偶数，则将当前数字变为二分之一*/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            } else if (arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
