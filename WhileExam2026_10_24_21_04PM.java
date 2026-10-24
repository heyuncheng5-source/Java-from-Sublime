/*GitHub2026_10_24_21_40PM*/
import java.util.Scanner;
public class WhileExam2026_10_24_21_04PM {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner myScanner1 = new Scanner(System.in);
        Scanner myScanner2 = new Scanner(System.in);
        Scanner myScanner3 = new Scanner(System.in);
        System.out.println("请输入起始数：");
        int start = myScanner1.nextInt();
        System.out.println("请输入终点数：");
        int end = myScanner2.nextInt();
        System.out.println("请输入除数：");
        int chu = myScanner3.nextInt();
        System.out.println("================================================");
        System.out.println("下列为在指定范围内所有符合要求的数：");
        while (start <= end) {
            if (start % chu ==0) {
                System.out.println(start);
                count += 1;
                sum += start;
            }
        start ++;
        }
        System.out.println("符合要求的数总共有" + count + "个");
        System.out.println("它们的总和是：" + sum);
    }
}