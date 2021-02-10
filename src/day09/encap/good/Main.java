package day09.encap.good;

public class Main {

    public static void main(String[] args) {

        Cat nabi = new Cat();

//        nabi.weight = 30; //완전하게 차단됨
        nabi.setWeight(13);
        nabi.printWeight();

//        double nabiWeight = nabi.weight;
        double nabiWeightForPound = nabi.getWeight(true);
        double nabiWeightForKg = nabi.getWeight(false);
        System.out.println("nabiWeightForPound = " + nabiWeightForPound);
        System.out.println("nabiWeightForKg = " + nabiWeightForKg);


    }
}
