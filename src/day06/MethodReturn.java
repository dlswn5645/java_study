package day06;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void printMulti(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1 * n2);
    }

    static void greeting(String nickName) {
        if (nickName.equals("멍청이")) {
            System.out.println("부를 수 없는 별명입니다.");
            return;//break문
        }
        System.out.println(nickName + "님 안녕하세요!");
    }

    //모든 메서드는 리턴값을 하나만 리턴할 수 있습니다.
    static int[] operateAll(int n1, int n2) {
        /*
        int plus = n1 + n2;
        int minus = n1 - n2;
        int multi = n1 * n2;
        int div = n1 / n2;
        int[] results = {plus,minus,multi,div};
        return results;
        */
        return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("result = " + result);

        //리턴 타입 void인 메서드는 변수에 저장 불가능
        //반드시 단독 호출해서 사용할 것!
        printMulti(5, 6);
        printMulti(add(5, 3), add(10, 2));
        printMulti(result, result);

        greeting("홍길동");
        greeting("멍청이");

        int[] datas = operateAll(20,5);
        System.out.println("덧셈 결과: " + datas[0]);
        System.out.println("곱셈 결과: " + datas[2]);
    }
}
