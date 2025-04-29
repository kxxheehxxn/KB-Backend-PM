package d0429.ch09GenericCollection.basic.lecture.extend;

public class WildCardFarm {

    //토끼가 어떤 토끼든 상관 없음
    //Rabbit, Bunny, Drunkenbunny
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }
    //토끼중 버니와 하위
    //Bunny, DrunkenBunny
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }
    //토끼중 버니와 상위
    //버니, 래빗
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
