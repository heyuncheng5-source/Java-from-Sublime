//GitHub2026_10_18
import java.util.Scanner;
public class Switch2026_10_18_16_05PM {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int score = (int)myScanner.nextDouble();//防止输入小数而报错！
        if(score >= 0 && score<=100) {
        switch((int)(score / 60)) {
        case 1 :
            System.out.println("合格");
            break;
        case 0 :
            System.out.println("不合格");
            break;
        // default :
        //     System.out.println("输入有误");
        }
    }else{
        System.out.println("输入有误");
    }
    }
}