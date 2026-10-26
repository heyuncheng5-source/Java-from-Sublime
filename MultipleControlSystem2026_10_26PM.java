/*GitHub2026_10_26_22_57PM*/
/*1.统计3个班成绩情况,每个班有5名同学,求出各个班的平均分和所有班级
    的平均分[学生的成绩从键盘输入]。
  2.统计三个班及格人数,每个班有5名同学。*/
import java.util.Scanner;
public class MultipleControlSystem2026_10_26PM {
    public static void main(String[] args) {
        //化繁为简：先搞第一个班的成绩收集并求数据
        Scanner myScanner = new Scanner(System.in);
        double sumScore = 0;
        double averageScore = 0;
        double totalScore = 0;
        double totalAverage = 0;
        int qualified = 0;
        for (int z = 1; z <= 3; z ++) {
            sumScore = 0;
            for (int i = 1; i <= 5; i ++) {
                System.out.println("请输入第" + z + "个班第" + i + "个学生的成绩");
                double score = myScanner.nextDouble();
                System.out.println("收到第" + z + "个班第" + i + "个成绩为：" + score);
                if (score >= 60) {
                    qualified ++;
                }
                sumScore += score;
                averageScore = sumScore / 5;
            }
        System.out.println("第" + z + "个班的总成绩是：" + sumScore);
        System.out.println("第" + z + "个班的平均成绩是：" + averageScore);
    totalScore += sumScore;
    }
    totalAverage = totalScore / (5 * 3);
    System.out.println("所有班的总成绩是：" + totalScore);
    System.out.println("所有班的平均成绩是：" + totalAverage);
    System.out.println("及格总人数是：" + qualified);
    }
}