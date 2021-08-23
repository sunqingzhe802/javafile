package cn.tedu.hello;

import java.awt.image.BandedSampleModel;

public class ReviewDemo {
    public static void main(String[] args) {
        animal a1 = new animal();
        cat c1 = new cat();
        dog d1 = new dog();
        a1.eat();
        c1.eat();
        c1.jump();
        d1.eat();
        d1.run();
        animal a2 = new cat();
        a2.eat();

    }
}
class animal{
    public void eat(){
        System.out.println("吃什么都行");
    }
}
class cat extends animal{
    public void eat(){
        System.out.println("吃鱼肉");
    }
    public void jump(){
        System.out.println("奔奔跳跳");
    }
}
class dog extends animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void run(){
        System.out.println("爱跑");
    }
}
