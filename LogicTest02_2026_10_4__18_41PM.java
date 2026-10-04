//GitHub2026_10_4_19_09PM
//演示逻辑运算符（||短路或）与（||逻辑或）
public class LogicTest02_2026_10_4__18_41PM {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        if(a < 3 || b > 6){
            System.out.println("ok1");//yes
        }
        if(a > 3 | b >4){
            System.out.println("ok2");//yes
        }
        //演示||与|的区别
        if(a < 3 || b++ >3){
            System.out.println("ok3");//yes
        }
        System.out.println("b=" + b);//b=5
        if(a < 3 | b++ > 3){
            System.out.println("ok4");//yes
        }
        System.out.println("b=" + b);//b=6
    }
}