package day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[여행을 원하는 계절을 적으세요!]");
        System.out.print(">> ");

        String season = sc.next();
        sc.close();

        //문자열, 정수형 변수나 상수를 넣는다.
        switch (season){

            //case에는 변수를 넣으면 안됨! 상수나 리터럴만 가능!
            case "spring":
            case "봄":
                System.out.println("봄에는 팔당으로 가보세요.");
                break;
            case "summer":
            case "여름":
                System.out.println("여름에는 대천으로 가보세요.");
                break;
            case "fall":
            case "가을":
                System.out.println("가을에는 지리산으로 가보세요.");
                break;
            case "winter":
            case "겨울":
                System.out.println("겨울에는 스키장으로 가보세요.");
                break;
            default:
                System.out.println("[봄, 여름, 가을, 겨울 중에 입력하세요!]");
        }
    }
}
