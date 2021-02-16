package day11.final_.field;

public class Main {

    public static void main(String[] args) {

        Korean kim = new Korean("970101 - 1234123");
        kim.name = "김철수";

//        kim.NATION = "중국";(x)
//        kim.password = "000101 - 1234123";(x)
        System.out.println(kim.NATION);
    }



}
