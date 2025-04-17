package d0415.ch02ConditionalLoopReference.basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = new int[1];
        intArray[0] = 10;

        String str = "";
        System.out.println("총 문자 수: " + str.length());
    }
}

