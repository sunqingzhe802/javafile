package cn.tedu.hello;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        System.out.println("请输入你的身高/m");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("请输入你的体重/kg");
        double weight = new Scanner(System.in).nextDouble();
        double result = weight/(height*height);
        if(result<18.5){
            System.out.println("过轻");
        }else if(result<22.9){
            System.out.printf("正常");
        }else if(result<24.9){
            System.out.println("偏胖");
        }else if(result<29.9){
            System.out.println("肥胖");
        }else if(result<40){
            System.out.println("过度肥胖");
        }else {
            System.out.println("极度肥胖");
        }

    }
}
