//GitHub2026_10_14_11_15AM
import java.util.Scanner;//表示把java.until这个包下的Scanner这个类导入
public class InputTest2026_10_14_10_47AM{
    public static void main(String[] args) {
        /*演示接收用户的输入信息
        ——用new语句来创建Scanner对象*/
        Scanner myScanner = new Scanner(System.in);
        //接下来接收用户的输入信息——使用相关的“方法”来实现
        System.out.println("请输入您的名字：");
        String name = myScanner.next();//在接收用户的输入
        System.out.println("请输入您的年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入您每月的薪水：");
        double sal = myScanner.nextDouble();
        System.out.println("您的个人信息如下：");
        System.out.println("名字=" + name
             + "\n年龄=" + age + "\n每月薪水=" + sal);
    }
}