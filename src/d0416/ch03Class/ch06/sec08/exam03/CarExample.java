package d0416.ch03Class.ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setGas(5);
        car1.isLeftGas();
        System.out.println("출발합니다.");
        car1.run();
        System.out.println("gas를 주입하세요");
    }
}
