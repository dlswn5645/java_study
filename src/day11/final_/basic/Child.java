package day11.final_.basic;

//Parent 클래스가 final 클래스이면 상속 받을 수 없음

public class Child extends Father {
    @Override
    public void giveMoney() {
        super.giveMoney();
    }

     /*
    //giveHouse메서드가 final메서드이기 때문에 오버라이딩불가
    @Override
    public void giveHouse() {
        super.giveHouse();
    }
    */
}
