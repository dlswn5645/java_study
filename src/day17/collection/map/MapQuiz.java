package day17.collection.map;

import java.util.*;
import java.util.Scanner;

public class MapQuiz {

    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        users.put("kim1234", "kkk1234");
        users.put("lee5678", "lll5678");
        users.put("park4321", "ppp4321");
      /*
       * <로그인 입력값 검증>

       * 1. 입력받은 아이디가 맵에 입력된 키값에
       *    해당하는지의 여부를 검사하여 아이디가 일치한다면
       *    다시한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
       *    "로그인 성공"을 콘솔에 출력하고 반복문을 탈출하세요.
       * 2. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요.
       * 3. 입력받은 아이디가 맵에 입력된 키값이 아니라면
       "아이디가 존재하지 않습니다"를 출력하세요.
       */

        while (true) {
            System.out.println("아이디와 비밀번호를 입력하세요.");
            System.out.print("ID: ");
            String ID = sc.next();

            if (users.containsKey(ID)) {
                System.out.print("PW: ");
                String PW = sc.next();
//                String realPw = users.get(ID);
                if(users.get(ID).equals(PW)){ //if(PW.equals(realPw))
                    System.out.println("로그인 성공");
                    sc.close();
                    break;
                }else {
                    System.out.println("비밀번호가 일치하지 않습니다.\n");
                }
            }else {
                System.out.println("회원가입된 아이디가 아닙니다.\n");
            }

        }
    }
}
