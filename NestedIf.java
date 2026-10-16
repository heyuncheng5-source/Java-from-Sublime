//GitHub2026_10_16_16_57PM
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        double score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入您的性别：");
            char gender = myScanner.next().charAt(0);
            if (gender == '男') {
                System.out.println("进入男子组");
            }else if (gender == '女') {
                System.out.println("进入女子组");
            }else {
                System.out.println("您输入的性别有误！本次查询作废！请重启程序。");
            }
        }else {
            System.out.println("您已被淘汰。");
        }
    }
}