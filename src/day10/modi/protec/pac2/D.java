package day10.modi.protec.pac2;

import day10.modi.protec.pac1.A;

public class D extends A { //패키지가 다르지만 그 클래스와 상속 관계라면 참조 가능

    public D() {
//        super(3.3); //default제한
        super(100); //protected제한

        f1 = 100;//protected제한
//        f2 = 200; //default제한

         m1();//protected제한
//         m2();//default제한
    }
}
