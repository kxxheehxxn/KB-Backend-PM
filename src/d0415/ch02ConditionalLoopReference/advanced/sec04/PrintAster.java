package d0415.ch02ConditionalLoopReference.advanced.sec04;

public class PrintAster {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("*".repeat(i));
        }
        for(int i = 5; i >= 1; i--){
            System.out.println("*".repeat(i));
        }
    }
}
