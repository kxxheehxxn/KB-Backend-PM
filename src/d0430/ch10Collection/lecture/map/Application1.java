package d0430.ch10Collection.lecture.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map
        * -> Collection 인테페이스들과는 다른 저장 방식
        * key, value 쌍으로 저장하는 방식
        *
        * key란?
        * - 값을 찾기 위한 이름 역할의 객체
        * - 키는 중복을 허용하지 않음, 키가 다르면 중복되는 값은 저장 가능
        * */

        HashMap hashMap = new HashMap<>();

        hashMap.put("1", "java8");
        hashMap.put("2", "java9");
        hashMap.put("3", "java10");
        hashMap.put("4", "java11");
//        hashMap.put("4", "java12"); -> 키는 중복저장되지 않고 최근키의 밸류로 덮어짐.
        System.out.println(hashMap);

        hashMap.remove("1");
        System.out.println(hashMap);
        //getOrDefault(key, DefaultValue)
        //지정한 키가 맵에 없을 때 기본값을 반환, 있을 때는 해당키의 value를 반환
        System.out.println("getOrDefault 테스트 : " + hashMap.getOrDefault("2","기본값"));

        /*
        * Iterator로 key-value 출력
        * */
        System.out.println("==========Set 을 이용해 Iterator 로 변환==========");

        // map에 저장된 모든 키를 셋 형태로 변환
        Set<String> keys = hashMap.keySet();

        //iterator() -> iterator 객체 반환
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();

            //키값을 밸류로 꺼냄
            String value = (String) hashMap.get(key);
            System.out.println(key + value);

        }

        for(String key : keys){
            String value = (String) hashMap.get(key);
            System.out.println(key+value);
        }

        System.out.println("==========Map 내부의 EntrySet 사용==========");
        //entrySet(): Map에 저장된 키와 밸류 쌍을 셋 형태로 뷰로 반환
        //이때 반환된 셋은 맵이랑 연결되어있어서 추가 수정 삭제를 하면 원본에도 반영
        //set<Map, Entry<K, V>> set = map.entrySet();
        Set<Map.Entry<String, String>> set = hashMap.entrySet();

        Iterator<Map.Entry<String, String>> entryIterator = set.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
