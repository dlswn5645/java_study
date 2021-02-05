package day06;

public class MethodQuiz1 {

    static int calcDivisor(int targetNumber) {
        int total = 0;
        System.out.printf("%d의 약수:", targetNumber);
        for (int i = 1; i <= targetNumber; i++) {
            if (targetNumber % i == 0) {
                System.out.printf("%d ", i);
                total += i;
            }
        }
        System.out.println();
        return total;
    }

    public static void main(String[] args) {
        System.out.println("10의 약수의 총합:" + calcDivisor(10));
        System.out.println("------------------------");
        System.out.println("10의 약수의 총합:" + calcDivisor(20));
    }
}
