package day15.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {

        char[] arr1 = {'J', 'A', 'V', 'A'};
//        char[] arr2 = arr1; //주소값 복사 (배열을 복사한 것이 아님)

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);//(원본 배열, 복사할 배열의 길이)

        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);//1이상 3미만

        arr1[2] = 'F';
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        //배열 정렬
        Integer[] numbers = {98, 84, 100, 12, 23, 18, 35};
        System.out.println("정렬 전: " + Arrays.toString(numbers));

        //오름차 정렬
        Arrays.sort(numbers);
        System.out.println("오름차 정렬 후: " + Arrays.toString(numbers));

        //내림차 정렬
        /*
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        for(int i = 0; i < numbers.length; i++){
            numbersCopy[i] = numbers[numbers.length - (i+1)];//끝의 인덱스를 첫번째 인덱스에 주는 것
        }
         */
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("내림차 정렬: " + Arrays.toString(numbers));
    }
}
//tip: 이탤릭체는 static
