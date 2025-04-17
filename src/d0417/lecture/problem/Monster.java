package d0417.lecture.problem;

public class Monster {
    /*
    * 접근 제어자
    * - 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * 1. public: 모든 패키지에서 접근 가능
    * 2. protected: 동일 패키지에 접근 가능(단, 상속관계에 있으면 다른 패키지에서도 접근 가능)
    * 3. default: 동일 패키지에서만 접근 허용
    * 4. private: 해당 클래스 내부에서만 접근 허용
    * */
    private String kinds;
    private int hp;


    //GETTER : 값을 인스턴스에서 꺼내기 위해 사용하는 메서드
    public String getKinds(){
        return this.kinds;
    }
    public int getHp(){
        return this.hp;
    }

    //SETTER : 인스턴스의 멤버 값을 설정하기 위해 사용하는 메서드
    public void setKinds(String kinds){
        this.kinds = kinds;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
