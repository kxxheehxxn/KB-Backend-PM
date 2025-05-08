package d0508.ch12Stream.lecture.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    /*
    * sorted(Comparator<>())
    * 스트림에 담긴 데이터를을 정렬해서 반환
    * */

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.of(5,10,99,2,4,6)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(integerList);
    }
}
