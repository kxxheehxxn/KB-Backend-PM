package d0423.ch06ExceptionHandling.lecture.exception.sec02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.println("가격을 입력하세요 ");
        int price = sc.nextInt();
        System.out.println();

        System.out.println("소지한 돈을 입력하세요");
        int money = sc.nextInt();
        System.out.println();

        try {
            et.checkEnoughMoney(price,money);
            System.out.println("==========상품 구입 가능==========");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("==========상품 구입 불가능==========");
        } finally {
            //예외처리 구문과 상관없이 사용할 때 작성
            sc.close();
        }
    }
}
