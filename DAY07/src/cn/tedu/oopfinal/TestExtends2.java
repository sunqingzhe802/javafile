package cn.tedu.oopfinal;
/*本类用于测试继承中构造方法的使用*/
/*1.子类创建对象时，默认会先去调用父类的构造方法
* 2.原因是由于子类构造函数的第一行默认存在super()--表示调用父类的无参构造
* 3.当父类没有无参构造时，可以通过super(参数)调用父类的其他含参构造
* 4.构造方法不可以被继承！！因为语法的原因，构造要求与类名同名，所以天然不符合要求*/
public class TestExtends2 {
    public static void main(String[] args) {
        //5.创建对象进行测试
        Father2 f2 = new Father2("红烧肉");
        Son2 s2 = new Son2();
        Son2 s3 = new Son2();
    }
}
//1.创建父类
class Father2{
    //3.创建父类的无参构造
//    public Father2(){
//        System.out.println("我是Father2的无参构造");
//    }
    public Father2(String s){
        System.out.println("爸爸爱吃"+s);
    }

}
//2.创建子类
class Son2 extends Father2{
    //4.创建子类的无参构造
    public Son2(){
        super("狮子头");
        System.out.println("我是Son2类的无参构造");
    }
}