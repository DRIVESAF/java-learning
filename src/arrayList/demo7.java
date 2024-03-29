package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/09 16:50
 * @description: 交换数组中的数据
 **/
public class demo7 {
    /*需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素
    交换前：1,2,3,4,5
    交换后：5,4,3,2,1*/
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1,2,3,4,5};
        // 暂存
        int temp = 0;

        for (int i = 0; i < 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
