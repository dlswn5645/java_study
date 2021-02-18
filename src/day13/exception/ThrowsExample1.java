package day13.exception;

public class ThrowsExample1 {

    public static String[] greeting = {"안녕","헬로","사와디캅"};

    //메서드마다 예외처리를 하면 메서드가 길어지기 때문에 throws를 통해 호출하는 main에 예외 발생한다는 경고문을 준다.
    //그럼 main에서 사용자가 직접 예외처리를 진행시킨다. 그럼 한 번에 예외처리가 되어 간편하게 처리할 수 있다.
    public static void greet1(int index) throws Exception{
        System.out.println("인사말: " + greeting[index]);
    }

    public static void main(String[] args) {
        try {
            greet1(12);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();//프로그램은 정상 종료되지만 에러 로그 출력,디버깅 할 때 중요
            System.out.println(e.getMessage());//에러 원인 메세지 리턴
        }
        System.out.println("프로그램 정상 종료");
    }
}
