package day02;

public class Casting3 {
    public static void main(String[] args) {
        
        char c = 'B';
        int i = 3;
        
        int result = c + i;
//        char result = (char)(c+i); 
        System.out.println("result = " + result);
        
        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println("b3 = " + b3);
//        byte b3 = (byte)(b1 + b2);
        
        int n = 5;
        int m = 27;
        
        double res = m/(double)n;
        System.out.println("res = " + res);
    }
}
