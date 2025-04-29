package d0429.ch09GenericCollection.basic.lecture.extend.run;

import d0429.ch09GenericCollection.basic.lecture.extend.*;

public class Application {
    public static void main(String[] args) {
        //제네릭 클래스 작성 시 extends 키워드를 이용해서
        //특정 타입만 제한을 걸 수 있다.
        //-> 특정 타입만 사용하도록 제한, 특정 타입 및 특정 타입의 자식타입들도
        //대입 가능

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<Snake>();
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setAnimal(new Bunny());
        farm1.getAnimal().cry();
    }
}
