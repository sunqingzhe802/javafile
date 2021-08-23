package cn.tedu.oop;

import java.io.File;

public class TestOop {
    public static void main(String[] args) {
        File f1 = new File("E:\\文档\\JAVACASE\\DAY11","Review");
        System.out.println(f1.mkdir());
        f1 = new File("E:\\文档\\JAVACASE\\DAY09","inter");
        System.out.println(f1.mkdir());
        f1 = new File("E:\\文档\\JAVACASE\\DAY09","inter2");
        System.out.println(f1.mkdir());

    }
}
