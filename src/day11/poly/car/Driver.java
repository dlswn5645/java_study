package day11.poly.car;

public class Driver {

    //오버로딩
    /*
    public void drive(Sonata s) {
        System.out.println("운전을 시작합니다.");
        s.run();
    }
    public void drive(Malibu m) {
        System.out.println("운전을 시작합니다.");
        m.run();
    }
    */

    //타입을 변화시켜 무수히 해야하는 오버로딩을 줄일 수 있음
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");
        c.run();
    }

    //리턴 타입의 공통 타입인 Car를 이용해서 리턴을 받는다.
    public Car buyCar(String carName) {
        if (carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("K5")) {
            System.out.println("K5를 구매합니다.");
            return new K5();
        } else if (carName.equals("말리부")) {
            System.out.println("말리부를 구매합니다.");
            return new Malibu();
        } else {
            System.out.println("구매할 수 없는 차입니다.");
            return null;
        }
    }
}
