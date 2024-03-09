package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 13:42
 * @description: switch case练习
 **/
public class demo1 {
    public static void main(String[] args) {
        //    兰州拉面、武汉热干面、北京炸酱面、陕西油泼面

//    定义变量记录我想吃的面
        String noodles = "海鲜面";
//    匹配
        switch(noodles){
            case("兰州拉面"):
                System.out.println("吃兰州拉面");
                break;
            case("武汉热干面"):
                System.out.println("吃武汉热干面");
                break;
            case("北京炸酱面"):
                System.out.println("北京炸酱面");
                break;
            case("陕西油泼面"):
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
