package day13.inter.electro;

//static 데이터를 쓸 때 간결하게 사용할 수 있다.
import static day13.inter.electro.RemoteControl.MAX_VOLUME;
import static day13.inter.electro.RemoteControl.MIN_VOLUME;

public class Television implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            this.volume = MAX_VOLUME;
        }else if(volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public void setMute() {
        this.volume = 0;
    }
}
