package cn.tedu.testserial;

public class test1 {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(a);
        String[] b = {"一", "二", "三", "一", "二", "三"};
        print(b);
        Double[] c = {4.234, 4.222, 6.6, 7.7};
        print(c);
    }
    /*
     * 泛型可以实现通用代码的编写，使用E表示元素的类型是Element类型
     * 2.泛型的语法要求：如果在方法上使用泛型，必须两处同时出现，
     * 一个是方法传入参数的类型是泛型，一个是返回值前加泛型<E>
     * */
    private static <E> void print(E[] c) {
        for (E i : c) {
            System.out.print(i);
        }
        System.out.println();
    }
}
