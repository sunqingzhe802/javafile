package cn.tedu.oopfinal;
/*本类用于学习静态代码块*/
/*执行顺序：
* 静态代码块->构造代码块->构造方法【对象创建成功】->局部代码块*/
public class TestStaticBlock {
    public static void main(String[] args) {
        //6.创建对象进行测试
        Person p = new Person();
        Person p2 = new Person();
        //7.触发局部代码块
        p.play();
    }
}

//1.创建Person类
class Person{
    //8.创建静态代码块
    /*位置：类里方法外
    * 执行时机：静态代码块也属于静态资源，随着类的加载而加载，优先于对象加载
    *         并且静态资源只会加载一次
    * 作用：用于加载那些需要第一时间就加载，并且只加载一次的资源*/
    static{
        System.out.println("我是静态代码块");
    }
    //2.创建构造代码块
    /*位置：类里方法外
    执行时机：每次创建对象时被触发，并且优先于构造方法执行
    作用：用于提取所有构造方法的共性功能*/
    {
        System.out.println("我是构造代码块");
    }
    //5.创建构造方法
    public Person(){
        System.out.println("我是无参构造");
    }
    //3.创建普通方法
    public void play(){
        System.out.println("我是一个普通方法");
        //4.创建局部代码块
        /*位置：方法里
        * 执行时机：执行本局部代码块所在的方法时才会执行
        * 作用：用于限制变量的作用范围*/
        {
            System.out.println("我是一个局部代码块~");
        }
    }

}