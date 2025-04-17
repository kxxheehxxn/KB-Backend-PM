package d0416.ch03Class.ch06.sec09;

public class Car {
    String model;
    int speed;
    Car (){

    }
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void run(){
        System.out.printf("%s(model 값)가 달립니다.(시속: %d(speed 값)km/h\n", model, speed);
    }
}
