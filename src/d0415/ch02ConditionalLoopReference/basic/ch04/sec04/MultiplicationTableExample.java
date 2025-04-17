package d0415.ch02ConditionalLoopReference.basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            System.out.println("*** " + i + "단 ***");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
        }
    }
}
