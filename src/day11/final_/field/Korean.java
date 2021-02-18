package day11.final_.field;

public class Korean {

    public String name; //이름

    //상수: 유일하고 불변한 값(대문자)
    public static final String NATION = "대한민국"; //국적(필드의 경우 final이 붙을 경우 초기화 해야함)
    //주민번호는 한번 결졍되면 못바꾸지만 사람마다 다르기 때문에 생성자를 통해 초기화를 해준다.
    public final String password; //주민번호

    public Korean(String password) {
        this.password = password;
    }
}
