package day13.inter.electro;

public interface RemoteControl {

    //인터페이스에 필드를 선언하면 자동으로 상수처리 됨
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //자바 8버전에서 default메서드가 등장
    default void setMute() {} //강제 오버라이딩 불가능
    //필요한 곳에 알아서 추가하면 됨
}
