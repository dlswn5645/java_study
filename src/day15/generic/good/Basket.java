package day15.generic.good;

//generic 클래스
public class Basket<F extends  Fruits>{

    //generic 타입 이용
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }

}
