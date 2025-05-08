package d0508.ch12Stream.basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalInt;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        long count = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 개수: " + count);

        // 2의 배수 총합
        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수 총합: " + sum);

        // 2의 배수 평균
        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average()
                .orElse(0.0);
        System.out.println("2의 배수 평균: " + avg);

        // 2의 배수 중 최대값
        int max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max()
                .orElse(Integer.MIN_VALUE);
        System.out.println("2의 배수 최대값: " + max);

        // 2의 배수 중 최소값
        int min = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .min()
                .orElse(Integer.MAX_VALUE);
        System.out.println("2의 배수 최소값: " + min);

        // 첫 번째 3의 배수
        OptionalInt firstMultipleOf3 = Arrays.stream(arr)
                .filter(n -> n % 3 == 0)
                .findFirst();
        System.out.println("첫 번째 3의 배수: " +
                (firstMultipleOf3.isPresent() ? firstMultipleOf3.getAsInt() : "없음"));
    }
}
