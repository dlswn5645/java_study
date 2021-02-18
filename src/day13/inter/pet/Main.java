package day13.inter.pet;

public class Main {

    public static void main(String[] args) {

        //다형성 구현(상속과 비슷하게 사용할 수 있음)
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet bull = new BullDog();

        Pet[] pets = {dog, cat, bull};
        for (Pet pet : pets) {
            pet.play();
            pet.eat();
        }
    }
}
