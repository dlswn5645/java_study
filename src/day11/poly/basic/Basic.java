package day11.poly.basic;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

    A x1 = new A();
    B x2 = new B();
    C x3 = new C();
    D x4 = new D();
    E x5 = new E();

    //모든 자식 객체는 부모의 타입을 가질 수 있다.
    A y1 = new B();
    A y2 = x3;
    A y3 = new D();
    A y4 = new D();
    A y5 = x5;
    A y6 = new E();

    //상속관계가 없다면 타입 변환 불가능
//    B z1 = new C();
//    C z1 = new D();

    public static void main(String[] args) {
         A a = new B();
        System.out.println(a);//타입만 바뀌었고 객체는 B이다.

        //모든 자바의 객체는 오브젝트를 사용할 수 있다.
        Object o1 = new A();
        Object o2 = new E();

    }



}
