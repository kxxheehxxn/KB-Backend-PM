package d0429.ch09GenericCollection.basic.lecture.extend;

//T 타입 변수는 Rabbit 타입 혹은 Rabbit 하위 타입들만 가능
//<T extends Animal> <- Animal은 인터페이스지만,
//인터페이스 타입으로 제한할 시에도 implements가 아니라 extends를 사용한다.
public class RabbitFarm<T extends Rabbit> {
    private T animal;
    public RabbitFarm() {
    }

    public RabbitFarm(T animal){
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
