package day17.collection.map;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        //map객체 생성 Map<찾기 위한 변수:key, 저장하고 싶은 변수:value>
        Map<String,Object> map  = new HashMap<>();

        //map에 객체 추가: put(key,value);
        map.put("멍멍이", "박영희");
        map.put("야옹이", "김철수");
        map.put("까마귀", "홍길동");
        map.put("청소당번", new String[] {"박영희","김철수"});//배열을 넣었기 때문에 주소값이 출력됨

        System.out.println(map);

        map.put("야옹이", "고길동");//기존 vlaue가 수정이 됨(김철수 -> 고길동)
        System.out.println(map);

        //map에 저장된 객체 수 : size();
        System.out.println("map의 객체 수: " + map.size());

        //map에 저장된 갹체 참조: get(key);
        String name = (String) map.get("까마귀");//downcasting 실행
        System.out.println("별명이 까마귀인 학생: " + name);

        //map의 반복문 처리
        System.out.println("-------------------------------------");
        for(String key : map.keySet()){
//            System.out.println(key);
//            System.out.println(map.get(key));
            Object value = map.get(key);
            if(value instanceof String) {
                System.out.println(key + ": " + value);
            } else if(value instanceof String[]){
                System.out.println(key +": " + Arrays.toString((String[])value));
            }
        }

        //map에 내부 데이터 삭제: remove(key);
        map.remove("까마귀");
        System.out.println(map);

        //map에 저장된 데이터 유무 확인: containsKey(),containsValue()
        System.out.println(map.containsKey("까마귀"));
        System.out.println(map.containsKey("청소당번"));
        System.out.println(map.containsValue("김철수"));

        map.clear();
        System.out.println("isEmpty: " + map.isEmpty());
    }
}
