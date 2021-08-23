package cn.tedu.review1;

import java.util.Random;
import java.util.Scanner;

public class GuestNum {
    public static void main(String[] args) {
       int gnum =  createnum();
       System.out.println(gnum);
       cnum(gnum);
    }
    private static void cnum(int gnum) {
        while (true){
            System.out.println("请输入你要猜的值");
            int cnum = new Scanner(System.in).nextInt();
            if(cnum > gnum){
                System.out.println("你猜大了");
            }else if(cnum < gnum){
                System.out.println("你猜小了");
            }else{
                System.out.println("你猜对了");
                break;
            }

        }
    }

    private static int createnum() {
        int a = new Random().nextInt(100);
        return a;
    }
}
