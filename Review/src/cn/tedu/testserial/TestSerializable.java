package cn.tedu.testserial;
import java.io.*;
public class TestSerializable {
    public static void main(String[] args) {
        method1();
        method2();
    }
    private static void method2() {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\test\\1.txt"));
            Object o = in.readObject();
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream("D:\\test\\1.txt"));
            Student s1 = new Student("李鬼",11,"中国","男");
            out.writeObject(s1);
            System.out.println("序列化成功");
        }catch (Exception e){
            System.out.println("序列化失败");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
