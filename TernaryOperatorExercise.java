//GitHub2026_10_11_11_13AM
/*1.目标：找出a,b,c三个数中的最大数
  2.思路：先比较前两个数，将他俩之间的最大数赋给max1；
        再比较max1与最后一个数，得出最大数赋给max2
  3.代码实现：如下*/
public class TernaryOperatorExercise {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int c = 5;
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 : c;
        System.out.println("三个数中的最大数为" + max2);
/*若只用一句话实现：
        int max = (a > b ? a : b) > c ?
         (a > b ? a : b) : c;
         即可直接输出*/
    }
}