/*GitHub2026_10_26_22_57PM*/
/*要求得到空心金字塔！
  化繁为简：1.先得到一个矩形 √
           2.再变成半个实心金字塔 √
           3.再变成一整个实心金字塔 √
           4.最后变成空心的 √*/
import java.util.Scanner;
public class MultipleControlSystemInterestingExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入想要生成的金字塔总层数：");
        int n = myScanner.nextInt();
        for (int i = 1; i <= n; i ++) {//i是正在操作的层级数
            for (int k = 1; k <= n - i; k ++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j ++) {
            if (j == 1 || j == 2 * i - 1 || i == n) {
            System.out.print("*");
        }else {
            System.out.print(" ");
        }
        }
        System.out.println('\t');
        }
    }
}