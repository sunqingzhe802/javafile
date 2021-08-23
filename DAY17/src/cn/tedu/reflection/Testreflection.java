package cn.tedu.reflection;
import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
public class Testreflection {
    @Test//通过反射对象获取构造方法
    public void getclazz(){
        Class<?> std = Student.class;
        Constructor<?>[] cs1 = std.getConstructors();
        for (Constructor i:cs1){
            System.out.println(i.getName());
//            System.out.println(i);
            Class[] pt1 = i.getParameterTypes();
            System.out.println(Arrays.toString(pt1));
        }
    }
    @Test//通过反射对象获取成员方法
    public void getmethod(){
        Class<?> getclazz = new Student().getClass();
        Method[] method1 = getclazz.getMethods();
        for (Method i :method1){
            System.out.println(i.getName());
            Class<?>[] pt1 = i.getParameterTypes();
            System.out.println(Arrays.toString(pt1));
        }
    }
    @Test
    public void getFields() throws Exception {
        Class<?> clazz = Class.forName("cn.tedu.reflection.Student");
        Field[] fields = clazz.getFields();
        for (Field i :fields){
            System.out.println(i.getName());
            System.out.println(i.getType().getName());
        }
    }
    @Test
    public void setFields() throws Exception {
        Class<?> std1 = Student.class;
        Field f1 = std1.getDeclaredField("age");
        System.out.println(f1.getType());
        System.out.println(f1.getType().getName());
        Object o = std1.newInstance();
        f1.setAccessible(true);
        f1.set(o,11);
        System.out.println(f1.get(o));
    }
    @Test
    public void setMethod1() throws Exception {
        Class<?> clazz = new Student().getClass();
        Method fly = clazz.getDeclaredMethod("fly", String.class, int.class);
        Object o = clazz.newInstance();
        fly.setAccessible(true);
        fly.invoke(o,"非尼玛",1111);

    }
}

