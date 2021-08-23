package cn.tedu.oopfinal;
/*本类用于测试继承中成员变量的使用*/
public class TestExtends1 {
    public static void main(String[] args) {
        //5.创建对象进行测试
        Son s = new Son();
        s.eat();
    }
}

//1.创建父类
class Father{
    //6.定义父类的成员变量
    int count = 1;
    int sum = 2;

}
//2.创建子类
class Son extends Father{
    //4.1定义子类的成员变量
    int sum = 100;
    //3.定义子类中的普通方法
    public void eat(){
        //4.2定义子类的局部变量
        int sum = 10;
        System.out.println(sum);//打印子类的局部变量sum
        System.out.println(this.sum);//打印子类的成员变量sum

        /*在子类中使用父类的sum资源，需要使用super进行指定
        * super表示父类的对象，可以理解成Father super = new Father();*/
       //7.使用父类的成员变量
        System.out.println(count);//使用父类不重名的成员变量
        System.out.println(super.sum);//使用父类重名的成员变量

    }
}