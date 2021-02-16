package day11.poly.overloading;

public class Basic {//오버로딩

    //데이터를 전달하면 해당 데이터의 타입을 출력하는 메서드

    //오버로딩 - 메서드의 이름을 똑같이 해도 됨, 단 매개변수를 다르게 해야함
    //alertType(String) - 오직 한개여야 함
    void alertType(String s) {
        System.out.println("문자열 1개가 전달됨!");
    }
    //alertType(int) - 오직 한개
    void alertType(int i){
        System.out.println("정수 1개가 전달됨!");
    }
    //alertType(double)
    void alertType(double d){
        System.out.println("실수 1개가 전달됨");
    }
    //alertType(int,double)
    void alertType(int a, double d){
        System.out.println("실수 1개가 전달됨");
    }
    //alertType(double,int)
    void alertType(double a, int d){
        System.out.println("실수 1개가 전달됨");
    }
    //alertType(double,double)
    void alertType(double a, double d){
        System.out.println("실수 1개가 전달됨");
    }
}
