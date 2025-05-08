package d0508.ch12Stream.advanced.ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));
        Stream<Student> studentStream = studentList.stream();
        IntStream scoreStream = studentStream.mapToInt(s->s.getScore());
        scoreStream.forEach(System.out::println);
    }
}