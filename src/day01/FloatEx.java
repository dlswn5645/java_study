package day01;

public class FloatEx {
    public static void main(String[] args) {

        float a = 7.12345F;//개념적으로만 알아두기 double을 더 많이 씀
        double b = 7.12345;

        a = 1.234567891234F; //어느 정도까지 밖에 안나옴
        b = 1.234567891234; //더 많이 표현 가능 

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        double n = 0.0;
        for (int i = 0; i < 100; i++){
            n += 0.1;
        }
        System.out.println("n = " + n);
    }
}
