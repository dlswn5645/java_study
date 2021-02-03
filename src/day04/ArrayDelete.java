package day04;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;


        /*
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        */

            System.out.println("삭제 후: " + Arrays.toString(arr));
        }
    }
