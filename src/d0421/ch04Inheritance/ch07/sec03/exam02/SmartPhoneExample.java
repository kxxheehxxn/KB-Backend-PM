package d0421.ch04Inheritance.ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Galaxy", "Silver");
        System.out.println("My Phone color = " + myPhone.color);
        System.out.println("My phone model = " + myPhone.model);

        /*
        * 상속
        * - 부모가 가지고 있는 재산을 자식이 물려받음
        * 단순히 물려받는것 보다는 자바에서는 확장의 개념을 의미
        * 물려받은 것 * ㅁ 를 할 수 있기 때문*/

        myPhone.printModel();
    }
}
