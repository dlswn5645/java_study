package day10.static_.singleton;

public class Main {

    public static void main(String[] args) {

         DbConnection connection1 = DbConnection.getConnection();//메서드를 통해 객체를 불러옴
         DbConnection connection2 = DbConnection.getConnection();
        //여러 개의 객체를 만든다 해도 객체는 한개(동일함)

        System.out.println(connection1);
        System.out.println(connection2);
    }
}
