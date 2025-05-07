package d0507.ch11Lambda.basic.ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        /*
        * 전략패턴
        * - 동작 방식을 자유롭게 바꾸고 싶을 때 사용
        * - Context -> Person
        * - Interface -> Workable(Abstract Interface work)
        * - Concrete Strategy -> 실제 구현체
        * */

        //실행문이 두 개 이상인 경우 중괄호 필요
        person.action(()->{
            System.out.println("출근을 합니다");
            System.out.println("프로그래밍을 합니다");
        });

        person.action(() -> System.out.println("퇴근합니다."));
    }
}
