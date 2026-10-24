/*GitHub2026_10_24_21_40PM*/
import java.util.Scanner;
public class ForExam2 {
    public static void main(String[] args) {
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("请输入终点数：");
        int end = myScanner1.nextInt();
        int start = 0;
        System.out.println("==============================");
        for (; start <= end; start ++) {
            System.out.println(start + "+" + (end - start) + "=" + end);
        }
    }
}