package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 15:26
 * @description: if的第三种格式
 **/
public class demo5 {
//    汽车驾驶遇到红灯停止、绿灯形式、黄灯减速
//    true 亮  false 灭

    public static void main(String[] args) {

        //两个都为true时只打印上面那个，是因为执行完最先遇到的合适条件之后程序停止

        boolean isLightRed = false;
        boolean isLightGreen = true;
        boolean isLightYello = true;

        if(isLightRed){
            System.out.println("stop!!!");
        } else if (isLightGreen) {
            System.out.println("GoGoGo!!!");
        } else if (isLightYello) {
            System.out.println("slow!!!");
        }
    }
}
