package cn.tedu.hello;

public class TestTeacher {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("dsd","sdds","dsadsa");
    }
    static class Teacher{
        String name;
        String subject;
        String sex;
    public Teacher(){
        System.out.println("我是无参构造");
    }
    public Teacher(String name){
        this.name = name;
        System.out.println("我是含餐构造");
    }
    public Teacher(String n,String s,String s1){
        name = n;
        subject = s;
        sex = s1;
        System.out.println("我是全参构造");
    }
    }
}
