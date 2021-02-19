package day14.api.lang.string;

import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "hello java";

        char c = s1.charAt(4);
        System.out.println("4번 인덱스 문자값: " + c);//o

        String result = s1.substring(6);//6번 인덱스부터 끝까지 잘라냄
        System.out.println(result);//java

        result = s1.substring(0,5);//0번 인덱스부터 5번 인덱스까지 잘라냄
        System.out.println(result);//hello

        int len = s1.length();
        System.out.println("총 글자수: " + len);

        int idx = s1.indexOf("o");
        System.out.println("o의 인덱스: " + idx);

        idx = s1.indexOf("java");//앞 글자 index알려줌
        System.out.println("java의 첫글자 인덱스: " + idx );

        idx = s1.indexOf("메롱");
        System.out.println("없는 글자의 인덱스: " + idx);

        //만약 l이 두개라면...
        System.out.println("l의 위치(앞에서부터): " + s1.indexOf("l"));
        System.out.println("l의 위치(뒤에서부터): " + s1.lastIndexOf("l"));

        System.out.println("------------------------------------");

        String fileName = "/upload/2021/02/19/야옹이는_못말려.JPG";
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);//.다음 부터 끝까지
        System.out.println("확장자명: " + ext);

        switch (ext.toLowerCase()) {//일단 확장자명을 소문자로 바꿔서 찾는다.(응용 버전)
            case "jpg": case "gif": case "png":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("기타 파일입니다.");
        }

        String greeting = "HEllo My WORld";
        System.out.println("------------------------------");
        System.out.println(greeting.toLowerCase());//다 소문자로 바꿔줌
        System.out.println(greeting.toUpperCase());//다 대문자로 바꿔줌

        String name = "         김철수                ";
        System.out.println(name.trim() + "님 안녕하세요!");//문자열 앞뒤 공백 제거

        String java = "java study, java program, java coffee";
        System.out.println(java.replace("java", "자바"));//문자열 대체
        System.out.println(java.replace("java", ""));//빈문자열 대체가능

//        article.replace("\n","<br>");

        String pet = "멍멍이, 야옹이, 어흥이, 짹짹이";
        String[] pets = pet.split(", ");
        System.out.println(Arrays.toString(pets));

        int x = 100;
        double y = 55.89;

        System.out.println(x + y);
        System.out.println(String.valueOf(x) + String.valueOf(y));//String으로 타입 변환
    }
}
