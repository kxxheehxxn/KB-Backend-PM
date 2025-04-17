package d0417.lecture.Problem2;

public class KindsOfVariable {
    /*
    * 클래스 영역에 작성하는 변수를 필드라고 함
    * 필드 == 멤버변수 == 전역변수(클랙스 전역에서 사용 가능한 변수)
    * */

    // 인스턴스 변수: non-static 필드를 의미
    // -> 인스턴스 생성 시점에 사용 가능한 변수라는 의미
    private int globalNum;

    // 정적 변수 == 클래스 변수 : static 필드를 의미
    private static int staticNum;

    public void testMethod(int parameter){
        /*
        * 지역 변수 : 메소드 영역에서 작성하는 변수
        * -> 매개변수도
        * */
        int localNum;
    } //메소드 영역 끝

} //클래스 영역 끝
