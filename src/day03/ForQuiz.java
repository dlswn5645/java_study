package day03;

public class ForQuiz {
    public static void main(String[] args) {
        int table = (int)(Math.random() * 8) + 2;

        System.out.printf("랜덤 구구단 %d단\n",table);
        System.out.println("---------------------");

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n",table,i,table*i);
        }
    }
}
