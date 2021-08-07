package cn.tedu.hello;

public class discount {
    public static void main(String[] args) {
        double d1 = 8888*0.75;
        double d2 = 8888-3000;
        double dmin = d1 < d2 ? d1 : d2;
        System.out.println("最小值是"+dmin);
    }
}
