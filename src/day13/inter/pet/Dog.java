package day13.inter.pet;

public class Dog implements Pet {//Pet의 명세서를 충실히 따름

    String name;
    int age;

    //오버라이딩을 강제로 할 수 밖에 없게 함
    public void play(){
        System.out.println("강아지는 마당에서 놀아요");
    }
    public void eat(){
        System.out.println("강아지는 사료를 먹어요");
    }
}
