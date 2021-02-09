package day08.modi.member.pac1;

public class A {

    //필든 선언
    public int f1;
    int f2; //default
    private int f3;

    //메서드 선언
    public void m1(){}
    void m2(){} //default
    private void m3(){}

    public A() {
        f1 = 1;
        f2 = 2;
        f3 = 3; //자기자신 클래스(same class)

        m1();
        m2();
        m3(); //same class
    }
}
