//GitHub2026_10_2_19_16
//1.分析需求：将华氏度1145.1145转为摄氏度
//2.分析思路：（1）用double来存储这两个温度
//           （2）摄氏度=5/9*（华氏度-100）
//3.编写代码：
//  注意陷阱！！！第11行代码运算时需要在一个整数后加.0，不然5/9=0！！！
//  以此自动升级另一个数的类型，使整体运算从整数除法升级成浮点数除法->增加精度
public class CodeForConvertingFahrenheitToCelsius {
    public static void main(String[] args) {
        double f = 1145.1145;
        double c = 5.0 / 9 * ( f - 32 );
        System.out.println("当华氏度为" + f + "时," + "摄氏度为" + c);
    }
}
