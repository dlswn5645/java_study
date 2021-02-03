package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String[] food = new String[count];

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        while (true){
            System.out.print("> ");
            String newFood = sc.nextLine();

            if(newFood.equals("그만")){
                System.out.println("입력종료");
                sc.close();
                break;
            }
            String[] temp = new String[count + 1];
            for (int i = 0; i < count; i++){
                temp[i] = food[i];
            }
            temp[temp.length - 1] = newFood;
            food = temp; temp = null;
            count++;

        }
        System.out.println("내가 먹고 싶은 음식들:"+ Arrays.toString(food));

    }
}
