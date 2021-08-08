package cn.tedu.hello;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("请输入要存的金额：");
        double price = new Scanner(System.in).nextDouble();
        System.out.println("请输入要存的年限");
        int year = new Scanner(System.in).nextInt();
        double result =  method1(year,price);
        System.out.println(result);
    }
    public static double method1(int year,double price) {
        double result;
        if(year>=5){
            result = price+(price*0.036*year);
        }else if(year>=3){
            result = price+(price*0.0325*year);
        }else if(year>=2){
            result = price+(price*0.027*year);
        }else{
            result = price+(price*0.0225*year);
        }
        return result;
    }
}
