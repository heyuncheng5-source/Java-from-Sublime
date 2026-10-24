/*GitHub2026_10_24_21_40PM*/
/*要求得到起始数到终点数之间且可被除数整除的数并记录其数量和总和
  训练！！！编程思维！！！
  1.化繁为简：将复杂要求拆开成细小实现步骤
  2.先死后活：先用常量试验，再套用变量*/
import java.util.Scanner;
public class ForExam2026_10_24_19_30PM {
public static void main(String[] args) {
    int count = 0;//计数器归零
    int sum = 0;//计算器归零
    Scanner myScanner1 = new Scanner(System.in);
    Scanner myScanner2 = new Scanner(System.in);
    Scanner myScanner3 = new Scanner(System.in);
    System.out.println("请输入起始数：");
    int start = myScanner1.nextInt();
    System.out.println("请输入终点数：");
    int end = myScanner2.nextInt();
    System.out.println("请输入除数：");
    int chu = myScanner3.nextInt();
    System.out.println("===========================================");
    System.out.println("下列为在指定范围内所有符合要求的数：");
    for (; start <= end; start += 1) {//化繁为简：1.先得到所有起始与终点之间的数
        if (start % chu == 0) {//化繁为简：2.用if语句来过滤粗略得到的数
            System.out.println(start);
        count ++;//计数器开始计可得到的数的总数
        sum +=start;//计算器开始累加计算总和
        }
    }
System.out.println("符合要求的数总共有" + count + "个");
System.out.println("它们的总和是：" + sum);
}
}
