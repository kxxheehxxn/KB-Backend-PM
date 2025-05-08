package d0508.ch12Stream.advanced.ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList< >();
        list1.add("this is java");
        list1.add("i am a best developer");
        List<String> words = list1.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .collect(Collectors.toList());
        words.stream().forEach(System.out::println);
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        List<Integer> numbers = list2.stream()
                .flatMap(number -> Arrays.stream(number.split(", ")))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers.stream().forEach(System.out::println);
    }
}