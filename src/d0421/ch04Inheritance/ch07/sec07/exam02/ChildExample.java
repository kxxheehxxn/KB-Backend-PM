package d0421.ch04Inheritance.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식타입 객체
        Child child = new Child();

        //부모타입 -> 자식타입을 업케스팅
        Parent parent = child; // 다형성
        parent.method1();
        parent.method2();
//        parent.method3();
    }
}
