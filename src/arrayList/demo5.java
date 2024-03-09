package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/09 15:35
 * @description: 求最值
 **/
public class demo5 {
    /*已知数组元素为{33,5,22,44,55}
    请找出数组中最大值并打印在控制台*/
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]){
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
