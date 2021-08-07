package cn.tedu.hello;
import java.util.Scanner;
/**本类用于求数字的绝对值*/
public class exec1 {
    public static void main(String[] args) {
        System.out.println("请输入您想得到的绝对值");
        double input = new Scanner(System.in).nextDouble();
        double result = method1(input);
        System.out.println(result);
    }
    private static double method1(double input) {
        if (input>=0){
            return input;
        }else {
            return -input;
        }
    }
}
