package cn.tedu.oopfinal;
/*本类用于测试静态的调用关系*/
/*总结：
* 1.普通资源既可以调用普通资源，也可以调用静态资源
* 2.静态资源只能调用静态资源*/
public class TestStatic2 {
}
//1.创建老师类
class Teacher{
    //2.定义普通属性与方法
    String name;
    public void teach(){
        System.out.println("正在授课中...");
        /*1.普通资源能否调用静态资源？--可以！！！*/
        System.out.println(age);
        ready();
    }
    //3.定义静态属性与方法
    static int age;
    public static void ready(){
        System.out.println("正在备课中...");
        /*2.静态资源能否调用普通资源？--不可以！*/
        //System.out.println(name);
        //teach();
    }
    public static void eat(){
        System.out.println("正在吃饭中...");
        /*3.静态资源能否调用静态资源？--可以！*/
        System.out.println(age);
        ready();
    }
}