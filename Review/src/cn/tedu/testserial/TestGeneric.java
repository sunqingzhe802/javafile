package cn.tedu.testserial;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
    /*    List l1 = new ArrayList();
        l1.add("sdd");
        l1.add("的撒");
        l1.add(2.3);
        l1.add(323);
        System.out.println(l1);
        List<String> l2 = new ArrayList();
        List<String> l3 = new ArrayList<String>();
        List<String> l4 = new ArrayList<>();
        l2.add("sdsd");
        l2.add("test");
        l2.add("112");
        System.out.println(l2);*/
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        print(a);
        String[] b = {"移动速度","大苏打","单位签订","的撒"};
        print(b);
        Double[] c = {23.2,44.23,22.24};
        print(c);
    }

    private static <E> void print(E[] c) {
        for (E i: c) {
            System.out.print(i);
        }
        System.out.println();
    }
}
