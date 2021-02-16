package day11.poly.car;

public class Main {

    public static void main(String[] args) {

        /*
        Car myCar = new Car();

        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();
        */

        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();

//        Sonata[] sonatas = {s1, s2, s3};

        Car k1 = new K5();
        Car k2 = new K5();
        Car k3 = new K5();

        Car m1 = new Malibu();
        Car m2 = new Malibu();
        Malibu m3 = new Malibu(); // <- 이것도 가능
        Car m4 = new Malibu();

        Car[] cars = {s1,s2,s3,k1,k2,k3,m1,m2,m3,m4};

        for(Car c : cars){
            c.run();
        }//타입을 변환 시켜도 안에는 자식객체이다. 변화하지 않음 - 오버라이딩의 장점

        Object[] oArr = {100,"33",3.5,true,new Car(), new Sonata(),cars};

        System.out.println("=================================================");
        Driver kim = new Driver();
        kim.drive(k2);
        kim.drive(m2);
        kim.drive(s1);

        System.out.println("=================================================");
        Sonata newCar = (Sonata) kim.buyCar("소나타"); //처음부터 downCasting - downCasting할 일이 많을 시 사용
        kim.drive(newCar);
//        ((Sonata)newCar).joinMembership();
        newCar.joinMembership();

    }
}
