package d0421.ch04Inheritance.ch07.sec08.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Tire tire = new Kumho();
        myCar.tire = tire;
        myCar.run();
    }
}
