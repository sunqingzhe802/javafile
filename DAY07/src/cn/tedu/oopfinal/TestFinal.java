package cn.tedu.oopfinal;
/*本类用于final的学习*/
public class TestFinal {
    public static void main(String[] args) {
        //6.2创建子类对象进行测试
        Son s = new Son();
        //s.name = "干饭人";//会报错，因为常量的值不能被修改
    }

}
/*1.final表示最终，可以用来修饰类
* 但是被final修饰类是最终类,无法被继承
* 也就是没有子类，它自己就是叶子节点*/
//1.创建父类
//3.测试类被final修饰
//final class Father{
class Father{
    //4.定义父类的普通方法
    /*2.final可以用来修饰方法，被final修饰的方法是这个方法的最终实现
    * 不可以被重写*/
    //final public void work(){//不然子类重写的方法会报错
    public void work(){
        System.out.println("在车间上班~");
    }
}
//2.创建子类
class Son extends Father{
    //6.1创建成员变量
    /*3.final可以用来修饰“变量”，注意其实不是“变量”，而是常量
    * 常量的值是不可以被更改的
    * 定义常量时必须要给常量同时赋值，不能先定义再赋值，不符合语法*/
    final String name = "打工人";
    final int a = 0;
    //5.重写父类的work()
    @Override
    public void work(){
        System.out.println("在格子间里上班");
    }
}