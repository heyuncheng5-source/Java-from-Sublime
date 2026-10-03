//GitHub2026_10_3_12_31PM
public class LogicTest01_2026_10_2__23_55PM {
    public static void main(String[] args) {
        int age = 50;
        //演示&&(短路与)
        if(age < 20 && age >30) {
            System.out.println("ok,age is 50(1)");//×
        }
        //演示&(逻辑与)
        if(age > 20 & age >30) {
            System.out.println("ok,age is 50(2)");//√
        }//演示两者的区别
        int a =2;
        int b =5;
        if(a < 1 && ++b<8) {
            System.out.println("ok,a=2 and b=5");//×
        }
        System.out.println("a=" + a + "," + "b=" + b);//a=2,b=5
        if(a < 1 & ++b<8) {
            System.out.println("ok,a=2 and b=5");//×
        }
        System.out.println("a=" + a + "," + "b=" + b);//a=2,b=6
    }
}