package d0422.ch05Abstract.basic.ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}
