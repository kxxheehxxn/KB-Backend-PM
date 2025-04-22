package d0422.ch05Abstract.lecture;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){
    }

    public abstract void abstMethod();

    public void nonStaticMethod(){
        System.out.println("추상 클래스 안의 논스태틱 호출");
    }

    public static void staticMethod(){
        System.out.println("추상 클래스 안의 스태틱 호출");
    }
}
