package d0415.ch02ConditionalLoopReference.advanced.sec04;

public class XandYFunction {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            for (int j = 0; j <= 12; j++) {
                if (4 * i + 5 * j == 60){
                    System.out.printf("(%d, %d)\n",i,j);
                }
            }
        }
    }
}
