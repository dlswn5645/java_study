package day14.api.util.random;


import day10.modi.protec.pac1.A;

import java.util.Arrays;

public class Lotto {

    //로또 랜덤 6개 배열을 생성하는 메서드
    public static int[] createLotto() {
        int[] lotto = new int[6];

        int i = 0;//배열의 인덱스 제어
        while (i < lotto.length) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            //중복체크
            boolean flag = false;//숫자가 중복되면 true
            for (int j = 0; j < i; j++) {
                if (randomNumber == lotto[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                lotto[i] = randomNumber;
                i++;
            }
        }
        Arrays.sort(lotto);
        return lotto;
    }

    //보너스 번호를 생성하는 메서드
    public static int createBonusNum(int[] win) {

        while (true) {
            int bonusNumber = (int) (Math.random() * 45) + 1;
            boolean flag = false;
            for (int num : win) {
                if (bonusNumber == num) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return bonusNumber;
            }
        }
    }

    //로또 번호를 몇 개 맞췄는지 확인하는 메서드
    public static void checkLotto(int[] win, int[] myLotto) {
        int count = 0; //맟춘 개수

        for (int i : myLotto) {
            for (int j : win) {
                if (i == j) {
                    count++;
                    break;
                }
            }
        }
        if (count == 6) {
            System.out.println("숫자가 6개 일치함");
        } else if (count == 5) {
            System.out.println("숫자가 5개 일치함");
        } else if (count == 4) {
            System.out.println("숫자가 4개 일치함");
        } else if (count == 3) {
            System.out.println("숫자가 3개 일치함");
        } else if (count == 2) {
            System.out.println("숫자가 2개 일치함");
        } else if (count == 1) {
            System.out.println("숫자가 1개 일치함");
        } else{
            System.out.println("숫자 모두 꽝입니다.");
        }
    }

    public static void main(String[] args) {
        int[] win = createLotto();
        System.out.println("***당첨 번호***");
        System.out.println(Arrays.toString(win));

        int bonus = createBonusNum(win);
        System.out.println("보너스 번호: " + bonus + "번");

        int[] muLotto = createLotto();
        System.out.println("***내가 산 로또***");
        System.out.println(Arrays.toString(muLotto));
        checkLotto(win, muLotto);

    }
}
