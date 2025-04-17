package d0415.ch02ConditionalLoopReference.basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        /*
        * SubString
        *
        * 인자가 1개일대
        * - 해당 인덱스값에서 끝까지
        *
        * 인자가 2개일 때 (시작인덱스, 끝 인덱스)
        * - 시작 인덱스부터 끝 인덱스까지를 반환(끝 인덱스에 해당하는 값은 반환하지 않는다)
        * */
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0,6);
        System.out.println("firstNum = " + firstNum);
        String secondNum = ssn.substring(7);
        System.out.println("secondNum = " + secondNum);

        /*
        * split
        * 문자열을 특정 구분자를 기준으로 잘라서 문자열 배열로 반환
        * */
        String[] tokens = ssn.split("-");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
    }
}
