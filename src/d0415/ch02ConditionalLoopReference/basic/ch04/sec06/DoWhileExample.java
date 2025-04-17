package d0415.ch02ConditionalLoopReference.basic.ch04.sec06;

import java.util.*;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        do {
            String a = sc.nextLine();
            if(a.equals("q")){
                sc.close();
                break;
            }
            else {
                System.out.println(a);
            }

        } while(true);
    }
}
