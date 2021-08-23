package cn.tedu.threa;

public class Testthrea {
    public static void main(String[] args) {
        mythreath m1 = new mythreath("java-线程1");
        mythreath m2 = new mythreath("java-线程2");
        m1.start();
        m2.start();

    }

}
class mythreath extends Thread {
    public mythreath(String name) {
        super(name);
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"本次线程是"+getName());
        }

    }
}