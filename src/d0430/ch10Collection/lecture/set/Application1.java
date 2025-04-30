package d0430.ch10Collection.lecture.set;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
            Set 인터페이스
            - 요소의 저장 순서를 유지하지 않음
            - 같은 요소의 중복 저장을 허용하지 않음 (null 값도 중복 X)
         */

        HashSet<String> hset = new HashSet<>();
        Set<String> set = new HashSet<>();

        hset.add("java");
        hset.add("MySQL");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        // 저장 순서 유지 X
        System.out.println(hset);

        // 중복 저장 X
        hset.add("java");
        System.out.println(hset);
        System.out.println("저장된 객체 수 : " +hset.size());

        System.out.println("포함 확인 : " + hset.contains("oracle"));
        System.out.println("포함 확인 : " + hset.contains("java"));

        for(String str : hset){
            System.out.println(str);
        }

        Object[] arr = hset.toArray();

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " : " + arr[i]);
        }

        boolean result = hset.remove("oracle");

        hset.remove("java");
        System.out.println("result : " + result);
        System.out.println("hset : " + hset);

        hset.clear();

        System.out.println("hset" + hset);
        System.out.println("hset is Empty?" + hset.isEmpty());
    }

}
