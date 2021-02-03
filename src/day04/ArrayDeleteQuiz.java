package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String searchTvxq = sc.nextLine();

            int idx;
            for (idx = 0; idx < tvxq.length ; idx++) {
                if (searchTvxq.equals(tvxq[idx])) {
                    break;
                }
            }

            //데이터가 탐색되었는지 조건 판단!
            if(idx != tvxq.length) {
                System.out.println(tvxq[idx] + "의 별명을 삭제합니다.");

                //삭제 알고리즘
                for(int i=idx; i<tvxq.length-1; i++) {
                    tvxq[i] = tvxq[i+1];
                }

                //배열 복사 알고리즘
                String[] temp = new String[tvxq.length-1];
                for(int i=0; i<temp.length; i++) {
                    temp[i] = tvxq[i];
                }
                tvxq = temp; temp = null;
                System.out.print("* 삭제 후 정보: "+ Arrays.toString(tvxq));
                break;
            }else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", searchTvxq);
                continue;
            }
        }
        sc.close();


    }
}
