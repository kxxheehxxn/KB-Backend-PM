package d0508.ch12Stream.advanced.ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5};
        Arrays.stream(intArray).asDoubleStream().forEach(System.out::println);
        System.out.println();
        Arrays.stream(intArray).forEach(System.out::println);
    }
}