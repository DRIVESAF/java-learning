package arrayList;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/09 15:19
 * @description:动态数组
 **/
public class demo4 {
    /*定义一个数组，用来存班里50个学生的姓名
    姓名未知，等学生报到之后，再进行添加*/
    public static void main(String[] args) {
        String[] arr = new String[50];

        arr[0] = "zhangsan";
        arr[1] = "lisi";
        //覆盖
        arr[1] = "wangwu";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //未赋值，打印出的是默认初始化值
        System.out.println(arr[2]);

        /*数组默认初始化规律
        整数：0
        小数：0.0
        字符：'/u0000' 空格
        布尔：false
        引用数据类型：null*/
    }
}
