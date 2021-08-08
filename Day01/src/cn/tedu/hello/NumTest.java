package cn.tedu.hello;

import java.util.Scanner;

public class NumTest {
    public static void main(String[] args) {
        System.out.println("请输入要计算的金额");
        double price = new Scanner(System.in).nextDouble();
        double price1 = price-price*0.1-5000;
        double result = 0;
        if(price1<=0){
            System.out.println("不交税");
        }else if(price1 > 0 && price1 <=3000){
            result = price1*0.03;
        }else if(price1 > 3000 && price1 <=12000){
            result = (3000*0.03)+((price1-3000)*0.1);
        }else if(price1 > 12000 && price1<=25000){
            result = (3000*0.3)+(9000*0.1)+((price1-12000)*0.2);
        }else if(price > 25000 && price<=35000){
            result = (3000*0.3)+(9000*0.1)+(13000*0.2)+((price1-25000)*0.25);
        }else if(price > 35000 && price<=55000){
            result = (3000*0.3)+(9000*0.1)+(13000*0.2)+(10000*0.25)+((price1-35000)*0.3);
        }else if(price > 55000 && price<=80000){
            result = (3000*0.3)+(9000*0.1)+(12000*0.2)+(25000*0.25)+(35000*0.3)+((price1-55000)*0.35);
        }else {
            result = (3000*0.3)+(9000*0.1)+(12000*0.2)+(25000*0.25)+(35000*0.3)+(55000*0.45)+((price1-55000)*0.35);
        }
        System.out.println("应该缴纳税："+result+"税后金额"+(price-(price*0.1)-result));
    }

}
