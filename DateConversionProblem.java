//GitHub2026_10_2_19_17
//1.需求分析：假如还有59天放假，问:合计还有几个星期，几天放假？
//2.思路分析：（1）使用int来保存天数
//           （2）求几个星期用 59 / 7
//           （3）求几天用 59 % 7
//3.输出代码：
public class DateConversionProblem {
    public static void main (String[] args) {
            int date = 59;
            int week = date / 7;
            int day = date % 7;
            System.out.println("还有59天放假，合计还有" + week + "个星期" + day + "天");
    }
}