package day15.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Basic {

    public static void main(String[] args) {

        //날짜 정보 얻기
        LocalDate curDate = LocalDate.now();
        System.out.println("현재 날짜: " + curDate);

        //목표 날짜 정보 얻기
        LocalDate targetDate = LocalDate.of(2022, 2, 24);
        System.out.println("목표 날짜: " + targetDate);

        //시간 정보 얻기
        LocalTime curTime = LocalTime.now();
        System.out.println("현재 시간: " + curTime);

        //목표 시간 정보 얻기
        LocalTime targetTime = LocalTime.of(19, 28, 30);
        System.out.println("목표 시간: " + targetTime);

        //날짜와 시간 정보 얻기
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + curDateTime);

        //날짜와 시간 정보를 필요한 것만 출력
        System.out.println(curDateTime.getYear());
        System.out.println(curDateTime.getMonth());
        System.out.println(curDateTime.getMonthValue());
        System.out.println(curDateTime.getDayOfMonth());
        System.out.println(curDateTime.getDayOfWeek());
        System.out.println(curDateTime.getDayOfYear());//일년 중에 오늘이 몇 일째 인지
    }
}
