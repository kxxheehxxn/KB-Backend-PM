package d0415.ch02ConditionalLoopReference.basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            int num = sc.nextInt();
            if (num == 1) {
                v++;
            } else if (num == 2) {
                v--;
            }else {
                break;
            }
            System.out.printf("현재 속도 = %d\n", v);
        }

    }
}
