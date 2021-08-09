package cn.tedu.hello;
import java.util.Scanner;
public class GetemailName {
    public static void main(String[] args) {
        System.out.println("请输入你的邮箱：");
        String emailname = new Scanner(System.in).nextLine();
        String mail = gatemail(emailname);
        System.out.println(mail);
    }
    public static String gatemail(String emailname) {
        int a = emailname.indexOf('@');
        if(a == -1){
            return "邮箱格式错误";
        }
        return emailname.substring(0,a);
    }
}
