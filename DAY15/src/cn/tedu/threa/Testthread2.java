package cn.tedu.threa;

public class Testthread2 {
    public static void main(String[] args) {
        myrunable m2 = new myrunable();
        Thread t1 = new Thread(m2);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m2);
        Thread t4 = new Thread(m2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class myrunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"本次线程是"+Thread.currentThread().getName());
        }
    }
}