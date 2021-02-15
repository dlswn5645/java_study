package day10.inherit.player;

//자식 클래스(sub class)
public class Warrior extends Player{

    int rage;

    //생성자
    public Warrior(String name) {
//        super(); //부모 player 생성자를 warrior가 부름 (원래 숨겨져 있음, 자동 삽입)
        super(name, 1, 50);
//        System.out.println("Warrior 객체 생성!");
    }

    void rush(){
        System.out.println(this.name + "님이 돌진합니다.");
    }

    //메서드 오버라이딩 - default보다 접근제한자를 푸는 것은 괜찮음(public)
    @Override //오버라이딩 검증 아노테이션
    void info() {
        super.info();
        System.out.println("# 분노: " + this.rage);
    }

}
