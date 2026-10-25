/*GitHub2026_10_25_22_40PM2*/
import java.util.Scanner;
public class Do_whileExercise2026_10_25_21_41PM {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输入起始数：");
        int start = scanner1.nextInt();
        System.out.println("请输入终点数：");
        int end = scanner2.nextInt();
        System.out.println("请输入需除数：");
        int chu0 = scanner3.nextInt();
        System.out.println("请输入非除数：");
        int chu1 = scanner4.nextInt();
        int count = 0;
        int sum = 0;
        System.out.println("————————————————————————————————");
        System.out.println("以下为所有符合要求的数：");
        do {
            if(start % chu0 ==0 && start % chu1 != 0) {
            System.out.println(start);
            count ++;
            sum += start;
        }
        start ++;
        }while (start <= end);
    System.out.println("符合要求的数共有" + count + "个");
    System.out.println("它们的总和是" + sum);
    }
}