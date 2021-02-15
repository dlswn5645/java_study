package day10.static_.basic;

public class Calculator {

    String color;
    static double pi; //공유해서 써야하는 것은 static을 붙인다.
    static String company = "casio";

    void paint(String color){
        this.color = color;
    }

    //계산기 공통 기능
    static double calcCircle(int r) {
        return pi * r * r;
    }
 }
