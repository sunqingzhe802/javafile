package cn.tedu.oopfinal;
/*本类用于测试继承中方法的使用*/
/*2.方法的重写：继承后，子类对父类的功能不满意，就可以重写父类的功能
* 重写的语法规则：两同 两小 一大
* 一大：子类方法的修饰符范围 >= 父类方法的修饰符范围--指的是访问控制符
* 两同：方法名相同，参数列表相同
* 两小: 子类方法的返回值类型 <= 父类方法的返回值类型【这个大小是继承关系，不是值的大小】
*      子类方法抛出的异常类型 <= 父类方法抛出的异常类型【这个还没学，不用管】
* 注意：如果父类方法的返回值类型是void,子类保持一致即可
* 注意：子类不可以重写父类的私有方法，还是因为不可见
* */
public class TestExtends3 {
    public static void main(String[] args) {
        //4.创建父子类对象
        Father3 f3 = new Father3();
        Son3 s3 = new Son3();
        f3.eat();
        s3.eat();/*1.继承后，子类可以使用父类的非私有资源*/
        /*3.如果子类对父类的功能进行了重写，调用的是重写以后的功能*/
    }
}

//1.创建父类
class Father3{
    //3.创建父类的普通方法
    public void eat(){
        System.out.println("爸爸爱吃肉");
    }
    public void play(){
        System.out.println("爸爸爱放风筝");
    }
}
//2.创建子类
class Son3 extends Father3{
    //5.新建子类特有的功能
    public void studyJava(){
        System.out.println("我拓展了学java的功能");
    }
    //6.对父类的方法进行重写
    @Override/*4.@Override这是一个注解，可以理解成一个标签，标记这个方法是一个重写的方法*/
    public void eat(){
        System.out.println("儿子爱吃蔬菜");
    }
}