package day13.inter.pet;

//인터페이스는 기능의 명세서이다. 인터페이스의 장점은 편리성과 다형성
//개념적으로는 추상클래스와 비슷함.
public interface Pet {

    //인터페이스는 자동으로 추상 메서드로 선언됨(abstract붙이지 않아도 사용 가능)
    void play();
    void eat();
}
