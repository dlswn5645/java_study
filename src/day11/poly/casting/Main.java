package day11.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.method1();
        p.method2();//재정의 된 부모가 나오지 않음
//        p.method3();//부모클래스가 자식클래스를 사용할 수 없음

        System.out.println("==============================");
        Parent c = new Child();
        c.method1();
        c.method2();//Child에서 재정의 된 부모가 나옴
        ((Child)c).method3();//오리지널 메서드를 사용하기 위해서는 Parent를 Child로 downcasting을 해주어야 한다.(일시적으로)
        // * () > . > 단항
    }
}
