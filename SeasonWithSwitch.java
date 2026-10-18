//GitHub2026_10_18
import java.util.Scanner;
public class SeasonWithSwitch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您现在所处的月份：");
        int month = myScanner.nextInt();
        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("现在是春季。");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("现在是夏季。");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("现在是秋季。");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("现在是冬季。");
                break;
            default :
                System.out.println("请输入正确的月份！");
            }
        }
    }