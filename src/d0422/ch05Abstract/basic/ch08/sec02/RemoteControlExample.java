package d0422.ch05Abstract.basic.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc = new Audio();
        rc.turnOn();
    }
}
