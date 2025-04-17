package d0416.ch03Class.ch06.sec07.exam05;


public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car(){

    }
    public Car(String model) {
        this(model, null, 0);
    }

    public Car(String model, String color) {
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
