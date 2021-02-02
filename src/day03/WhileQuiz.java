package day03;

import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int begin = sc.nextInt();

        System.out.print("정수2: ");
        int end = sc.nextInt();

        int num1 = begin;
        int total = 0;

        while(num1 <= end){
            total += num1;
            num1++;
        }
        System.out.printf("%s ~ %s까지의 총합: %s",begin,end,total);
    }
}
