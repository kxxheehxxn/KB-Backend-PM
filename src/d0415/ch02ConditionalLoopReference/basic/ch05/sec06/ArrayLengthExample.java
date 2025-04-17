package d0415.ch02ConditionalLoopReference.basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }
}
