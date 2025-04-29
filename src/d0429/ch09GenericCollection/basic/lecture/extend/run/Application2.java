package d0429.ch09GenericCollection.basic.lecture.extend.run;

import d0429.ch09GenericCollection.basic.lecture.extend.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 와일드카드(WildCard)
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 떄
        * 그 객체의 타입 변수를 제한 할 수 있다.
        * <?> : 제한 없음
        * <? extends Type> : 와일드 카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 사용가능)
        * <? super Type> : 와일드카드의 하한 제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 사용 가능)
        *
        * */
        WildCardFarm wildCardFarm = new WildCardFarm();

        //토끼 농장 자체가 생성 불가능한 것은 매개변수로 사용 불가능
//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        //와일드카드의 매개변수 타입 제한이 extends인 경우
        //버니와 버니의 후손만 가능하기 때문에 래빗은 버니의 상위라 안됨
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        //와일드카드의 매개변수 타입 제한이 super인 경우
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
