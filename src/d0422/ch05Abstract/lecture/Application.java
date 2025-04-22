package d0422.ch05Abstract.lecture;

public class Application {
    public static void main(String[] args) {
        /*
        * 추상 클래스
        * - 추상 메서드를 0개 이상 포함하는 클래스
        * - abstract 키워드를 사용해서 선언
        * - 직접 인스턴스를 생성 불가 (new 로 객체 생성 불가)
        * - 하위 클래스가 상속받아 구현해야 사용 가능
        * -> 다형성을 활용할 수 있다.
        *
        * 추상 메서드
        * - 메서드 선언부만 있고 구현부는 없는 메서드
        * - 반드시 abstract 키워드 붙여야함
        * - ex) public abstract void method()
        * - 하위 클래스는 메서드를 반드시 오버라이딩 해야한다.
        * */

        //Product pro = new Product(); -> 추상 클래스는 인스턴스 생성 불가
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstMethod();

        //instanceOf
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product pro = new SmartPhone();

        //동적 바인딩
        pro.abstMethod();

        Product.staticMethod();
        pro.nonStaticMethod();


    }
}
