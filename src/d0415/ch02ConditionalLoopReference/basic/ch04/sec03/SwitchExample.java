package d0415.ch02ConditionalLoopReference.basic.ch04.sec03;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(6) + 1;
        switch(num){
            case 1:
                System.out.println(num);
                break;
            case 2:
                System.out.println(num);
                break;
            case 3:
                System.out.println(num);
                break;
            case 4:
                System.out.println(num);
                break;
            case 5:
                System.out.println(num);
                break;
            case 6:
                System.out.println(num);
                break;
            default:
                break;
        }
    }
}
