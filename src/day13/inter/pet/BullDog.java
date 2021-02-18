package day13.inter.pet;

//상속과 같이 쓸때는 상속을 먼저 적어야 함.
public class BullDog extends Dog implements Pet,Huntable{//다중 인터페이스도 구현 가능

    @Override
    public void play() {
        System.out.println("불독은 사납게 짖으며 놀아요");
    }

    @Override
    public void eat() {
        System.out.println("불독은 고기를 먹어요");
    }

    @Override
    public void hunt() {
        System.out.println("불독은 이빨로 사냥해요");
    }
}
