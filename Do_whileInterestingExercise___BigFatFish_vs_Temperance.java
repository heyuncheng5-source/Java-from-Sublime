/*GitHub2026_10_25_22_40PM2*/
import java.util.Scanner;
public class Do_whileInterestingExercise___BigFatFish_vs_Temperance {
    public static void main(String[] args) {
        Scanner t_answer = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("贪婪的的大肥鱼使出——！！杀鲸霸拳！！");
            System.out.println("打完一顿后大肥鱼掐着穷逼Temperance的脖子问他给不给充白饭？");
            System.out.println("Temperance的选择是……（yes / no）");
            answer = t_answer.next().charAt(0);
        }while (answer != 'y');
    System.out.println("“你骂我也没用~我就是爱吃白饭的大肥鱼~~~”肥鱼吃白饭ing……");
    }
}