//GitHub2026_10_18
import java.util.Scanner;
public class aAbBcCdDeEfFgG {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入在a~g中您想要转换的小写字母：");
        char small = myScanner.next().charAt(0);
        switch(small) {
        case 'a' :
            System.out.println("A");
            break;
        case 'b' :
            System.out.println("B");
            break;
        case 'c' :
            System.out.println("C");
            break;
        case 'd' :
            System.out.println("D");
            break;
        case 'e' :
            System.out.println("E");
            break;
        case 'f' :
            System.out.println("F");
            break;
        case 'g' :
            System.out.println("G");
            break;
        default:
            System.out.println("请输入在所给范围内的小写字母");
        }
    }
    }