package day10.modi.protec.pac1;

public class B { //같은 패키지안에 있으므로 모두 가능

    public B() {
        A a1 = new A(10);//protected 생성자
        A a2 = new A(3.3);// default제한 생성자

        a1.f1 = 10;//protected제한 필드
        a1.f2 = 20;// default제한 필드

        a1.m1();//protected제한 메서드
        a1.m2();// default제한 메서드
    }

}
