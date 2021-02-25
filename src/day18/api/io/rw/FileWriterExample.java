package day18.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

//텍스트 저장 전용
public class FileWriterExample {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\developing_sij\\iotest\\텍스트저장연습.txt");

            String str = "지금은 자바 웹 개발자 양성 과정 수업 중 입니다. \r\n 집에 가고 싶다";

            fw.write(str);
            System.out.println("파일을 정상 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
