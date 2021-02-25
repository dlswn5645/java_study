package day18.api.io.stream;

import java.io.*;
import java.util.Scanner;


public class OutputStreamExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("파일명을 입력: ");
        String fileName = sc.next();

        String filePath = "D:\\developing_sij\\iotest\\"+ fileName + ".txt";

        OutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);

            System.out.print("문장 입력: ");
            sc.nextLine();
            String str = sc.nextLine();

            //write메서드는 오직 byte데이터만 사용 가능
            //따라서 String을 파일에 쓸려면 byte로 변환해야 함
            fos.write(str.getBytes());

            System.out.println("파일이 정상 저장되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
