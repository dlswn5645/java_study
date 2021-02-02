package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctCount = 0;
        int errorCount = 0;

        while (true) {
            int firstNumber = (int) (Math.random() * 100) + 1;
            int secondNumber = (int) (Math.random() * 100) + 1;

            System.out.printf("%d + %d = ?\n", firstNumber, secondNumber);
            System.out.print("> ");
            int table = sc.nextInt();
            int correct = firstNumber + secondNumber;

            if (table == 0) {
                System.out.println("입력 종료");
                break;
            } else if (table == correct) {
                System.out.println("정답입니다!!");
                correctCount++;
            } else {
                System.out.println("틀렸는데요??");
                errorCount++;
            }
        }
            System.out.println("================");
            System.out.println("정답횟수: "+ correctCount);
            System.out.println("오답횟수:"+ errorCount);

            sc.close();
        }
    }

