package cn.tedu.testserial;
import java.io.Serializable;
public class Student implements Serializable {
    private String name;
    private int age;
    private String addr;
    private String sex;
    public Student(){}
    public Student(String name, int age, String addr, String sex) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
