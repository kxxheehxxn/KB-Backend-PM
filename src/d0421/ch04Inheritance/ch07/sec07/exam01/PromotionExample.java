package d0421.ch04Inheritance.ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * - 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
        * - 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있게도 하고
        * - 하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다.*/
        B b = new B(); // A 상속
        C c = new C(); // A 상속
        D d = new D(); // A - B 상속
        E e = new E(); // A - C 상속

        //업캐스팅
        // 자식 -> 부모로 대입 시 자동 타입 형변환이 발생
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;
        B b1 = d;
        C c1 = e;
        // E는 C의 자식 -> B와 관계가 없음
//        B b3 = e;

        // D는 B의 자식 -> C와 관계가 없음
//        C c2 = d;

        //다운캐스팅
        // 부모 -> 자식
        A a = new A();
        B a5 = (B) a;

        Object o = new B();
        A a6 = new E();
        B b3 = (B) a6;

    }
}