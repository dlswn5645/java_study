package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        int x = 10, y = 20;
        System.out.println((x != 10) && (++y == 21));
//        System.out.println((x != 10) & (++y == 21));//false
        System.out.println((x == 10) || (++y == 21));
//        System.out.println((x == 10) | (++y == 21));//true
        System.out.println("x: " + x + ",y:" +y);//x:10, y:20
//        System.out.println("x: " + x + ",y:" +y);//x:10, y:22
    }
}
