package cn.tedu.hello;

public class DeadCycle {
    public static void main(String[] args) {
        while (true){
            System.out.println("while");
        }
        for (int i = 1;  ; i++) {
            System.out.println("for ");
        }
        do {
            System.out.println("do while");
        }while (true);
    }
}
