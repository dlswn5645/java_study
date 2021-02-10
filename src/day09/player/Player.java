package day09.player;

public class Player {

    public String name;
    int level;
    int hp;

//    this(): 나의 다른 생성자를 부르는 것
    public Player() {
        this("이름없음",1,50);//무조건 첫줄에 쓰기
//        System.out.println("1번 생성자 호출");
    }

    public Player(String name) {
        this(name,1,50);
//        System.out.println("2번 생성자 호출");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }//필드와 지역변수의 이름이 같은 경우 구분을 하기 위해 this를 사용한다.

    public Player(String name,int level) {
//        System.out.println("3번 생성자 호출");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

    public Player(String name, int level, int hp) {
//        System.out.println("4번 생성자 호출");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    void attack(Player target) { //Player this가 숨어있음.
        System.out.println("------------------------------------");
//        System.out.println("this의 주소값:" + this);
//        System.out.println("target의 주소값:" + target);
        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
    }

    public void info(){
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n",this.name,this.level,this.hp);
    }

}
