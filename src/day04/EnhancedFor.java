package day04;

public class EnhancedFor {

    public static void main(String[] args) {

        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        /*
        for(int i = 0; i < week.length; i++){
            System.out.println(week[i] + "요일");
        }
         */
        for(char day : week){
            System.out.println(day + "요일");
        }

        System.out.println("=================================");

        for(int n : new int[]{1,3,5,7,9}){
            System.out.println(n);
        }

        System.out.println("=================================");

        //Quiz
        int[] scores = {98,71,85,100,99,100};

        int total = 0;
        for(int numbers : scores){
            total += numbers;
        }
        double avg = (double) total/scores.length;
        System.out.printf("총점: %d점,평균: %.2f점",total,avg);

    }
}
