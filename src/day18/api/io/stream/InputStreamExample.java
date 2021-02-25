package day18.api.io.stream;

//파일 입풀력 관련 패키지

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {

        String filePath = "D:\\developing_sij\\iotest\\test.txt";

        InputStream fis = null; //전역변수 처리 (fis.close 사용하기 위해서)
        try {
            fis = new FileInputStream(filePath);//이미지나 동영상을 읽을 때 많이 사용

            while (true) {
                int data = fis.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다!");
        } finally {
            //자원 해제 (하드디스크에 접근하기 떄문에 성능상 문제가 생김)
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
