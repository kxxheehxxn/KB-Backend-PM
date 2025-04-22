package d0422.ch05Abstract.basic.ch08.lecture;

public interface InterProduct {
    /*
    * 인터페이스는 상수 필드만 작성 가능
    * public static final ->  조합을 상수 필드 -> 선언과 동시에 초기화해야함
    * */

    //public static final int a = 0;

    //public static final이 숨어있음
    int MIN_NUM = 10;
    int MAX_num = 100;

    //생성자를 가질 수 없음
    //public InterProduct(){};

    //인터페이스는 구현부가 있는 메서드를 가질 수 없다.
    //public void nonStaticMethod(){}

    //static 메서드는 가질 수 있음(java 8버전 이후)
    public static void staticMethod(){
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨");
    }

    //추상 메서드만 작성 가능
    public abstract void nonStaticMethod();

    /*
    * 인터페이스 안에 작성한 메서드는 public abstract 의 의미를 가진다.
    * 인터페이스를 상속받은 클래스는 메서드를 구현할 때 접근 제어자를 public 으로 해야 구현 가능
    * */
    void abstMethod();

    //인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야 한다.
    public default void defaultMethod(){

    }
}

