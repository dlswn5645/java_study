package day07;

//기존 클래스 - 실행 클래스(main을 가지고 있는 것
//설계용 클래스 - 객체를 만들기 위한 용도(설계용 클래스에는 main메서드를 만들지 않는다.

import java.util.Arrays;

public class Idol {//속성(필드) : 4개

    //클래스 내부에는 객체의 속성과 기능을 정의합니다.
    //객체의 속성들을 필드라고 부릅니다.

    String teamName;//팀이름
    int memberNumbers; //멤버수
    String[] memberNames;//멤버 이름들

    //부품 데이터
    Album album;

    //객체의 기능들을 메서드라고 부른다.
    //설계용 메서드는 static울 븉이지 않는다.

    void sing() {
        System.out.println(teamName + "이(가) 노래합니다.");
    }

    void dance() {
        System.out.println(teamName + "이(가) 춤합니다.");
    }
    void introduce() {
        System.out.printf("안녕하세요! 저희는 %s입니다. %d인조 그룹입니다." + "\n멤버들은 %s입니다.\n",teamName, memberNumbers, Arrays.toString(memberNames));
    }
}
