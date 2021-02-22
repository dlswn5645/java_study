package day15.generic.good;

public class Main {

    public static void main(String[] args) {

        Basket<Apple> ab = new Basket<Apple>();

        ab.setFruit(new Apple());
        Apple apple = ab.getFruit();

        Basket<Peach> pb = new Basket<Peach>();
        pb.setFruit(new Peach());
        Peach peach = pb.getFruit();

//        Basket<Water> wb = new Basket<Water>(); 과일 관련 클래스만 받을 수 있게 됨
    }
}
