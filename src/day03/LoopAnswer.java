package day03;

import java.util.Scanner;

public class LoopAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctCount = 0;
        int errorCount = 0;

        while(true) {
            int first = (int) (Math.random() * 100) + 1;
            int second = (int) (Math.random() * 100) + 1;

            //기호를 결정할 랜덤 정수
            int markNum = (int) (Math.random() * 3);
            String mark = "+";
            switch (markNum) {
                case 0:
                    mark = "+";
                    break;
                case 1:
                    mark = "-";
                    break;
                case 2:
                    mark = "x";
                    break;
            }

            System.out.println("-------------------------");
            System.out.printf("%d %s %d = ?\n", first, mark, second);
            System.out.print("> ");
            int answer = sc.nextInt();

            int correct;
            switch (mark) {
                case "+":
                    correct = first + second;
                    break;
                case "-":
                    correct = first - second;
                    break;
                case "x":
                    correct = first * second;
                    break;
                default:
                    correct = 0;
            }

            if (answer == 0) {
                System.out.println("입력종료");
                break;
            }

            if (answer == correct) {
                System.out.println("정답입니다.");
                correctCount++;
            } else {
                System.out.println("오답입니다.");
                errorCount++;
            }
        }
            System.out.println("=====================");
            System.out.println("정답횟수:"+correctCount);
            System.out.println("오답횟수:"+errorCount);

            sc.close();

        }
    }

