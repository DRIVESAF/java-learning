package JudgmentAndCirculation;

/**
 * @author: DRIVESAF
 * @createTime: 2024/03/05 14:57
 * @description: switch简化写法，jdk12新特性
 **/
public class demo3 {
    public static void main(String[] args) {
        int number = 6;
       /* switch(number){
            case 1 -> {
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("2");
            }
            case 3 -> {
                System.out.println("3");
            }
            default -> {
                System.out.println("*");
            }
        }*/

        //括号内只有一行语句可以不写大括号
        switch(number){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("*");

        }
    }
}
