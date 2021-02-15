package day10.static_.basic;

public class Main {

    public static void main(String[] args) {

        Count c1 = new Count();
        c1.num1 = 10;
        Count.num2 = 10;

        Count c2 = new Count();
        c2.num1++;
        Count.num2++;

        Count c3 = new Count();
        c3.num1 += 20;
        Count.num2 += 20;

        System.out.println("c1.num1: "+ c1.num1);
        System.out.println("c1.num2: "+ Count.num2);
        System.out.println("c2.num1: "+ c2.num1);
        System.out.println("c2.num2: "+ Count.num2);
        System.out.println("c3.num1: "+ c3.num1);
        System.out.println("c3.num2: "+ Count.num2);

        double r = Math.PI;//PI도 앞에 static이 붙어있음

        c1.method1();
        c3.method1();

        Count.method2();
    }
}

//static은 객체를 생성하지 않아도 호출이 가능 but 생성자는 사용하지 않는다.
// 정적 초기화 블록을 이용하여야 한다.
