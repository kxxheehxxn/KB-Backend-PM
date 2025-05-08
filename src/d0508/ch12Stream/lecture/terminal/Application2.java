package d0508.ch12Stream.lecture.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {

    /*
    * reduce(): 스트림에 있는 데이터들의 총합을 계산
    * */

    public static void main(String[] args) {
        OptionalInt reduceOneParam = IntStream.range(1,4)
                .reduce((a,b) -> {
                    return Integer.sum(a,b);
                });
        System.out.println("reduceOneParam = " + reduceOneParam);
        
        int reduceOTwoParam = IntStream.range(1,4)
                .reduce(100,(a,b) -> {
                    return Integer.sum(a,b);
                });
        System.out.println("reduceOTwoParam = " + reduceOTwoParam);
    }
}
