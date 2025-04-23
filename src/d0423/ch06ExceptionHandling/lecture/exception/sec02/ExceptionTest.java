package d0423.ch06ExceptionHandling.lecture.exception.sec02;

import d0423.ch06ExceptionHandling.lecture.exception.sec02.exception.*;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException,MoneyNagativeException,NotEnoughMoneyException{
        //가격이 음수일 때
        if(price < 0){
            throw new PriceNegativeException("가격은 음수일 수 없습니다");
        }
        //가지고 있는 돈이 음수일 때
        if(money < 0 ){
            throw new MoneyNagativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        //가지고 있는 돈이 부족할 때
        if(money >= price){
            System.out.println("Good");
        }else{
            throw new NotEnoughMoneyException("가지고 있는 돈보다 상품 가격이 비쌉니다ㅠㅠ");
        }
    }
}
