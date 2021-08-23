package cn.tedu.reflection;

public class Student {
    public String name;
    public int phonenum;
    private String addr;
    private int age;
    public Student(){}

    public Student(String name, int phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
    public void eat(int n){
        System.out.println("我想吃"+n+"碗饭");
    }
    private void fly(String name,int height){
        this.name = name;
        System.out.println("我的名字是"+name+"我想飞"+height);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phonenum=" + phonenum +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }
}
