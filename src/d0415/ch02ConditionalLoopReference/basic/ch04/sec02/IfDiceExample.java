package d0415.ch02ConditionalLoopReference.basic.ch04.sec02;

import java.util.Random;

import static java.lang.Math.*;

public class IfDiceExample {
    public static void main(String[] args) {
//1 ~ 6 사이의 값을 랜덤
//        int num = (int) (Math.random() * 6) + 1;
        Random rand = new Random();
        int num = rand.nextInt(6)+1;
        if (num == 1) {
            System.out.println(num);
        } else if (num == 2) {
            System.out.println(num);
        } else if (num == 3) {
            System.out.println(num);
        } else if (num == 4) {
            System.out.println(num);

        } else if (num == 5) {
            System.out.println(num);
        } else {
            System.out.println(num);
        }
    }
}
