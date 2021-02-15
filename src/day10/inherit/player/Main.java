package day10.inherit.player;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("짱짱전사님");
//        w.name = "짱짱맨전사";
        w.level = 1;
        w.hp = 20;
        w.rage = 50;

        w.info();

        Mage m = new Mage();
        m.name = "울트라마법사";
        m.level = 1;
        m.hp = 50;

        m.info();
    }
}
