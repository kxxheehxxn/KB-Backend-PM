package d0508.ch12Stream.basic.ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");
        list.stream()
                .distinct().forEach(name -> System.out.println(name));
        System.out.println();
        list.stream()
                .filter(name -> name.startsWith("신"))
                .forEach(name -> System.out.println(name));
        System.out.println();
        list.stream()
                .distinct()
                .filter(name->name.startsWith("신"))
                .forEach(name-> System.out.println(name));
    }
}