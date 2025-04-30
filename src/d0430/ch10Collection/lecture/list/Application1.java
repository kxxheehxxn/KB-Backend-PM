package d0430.ch10Collection.lecture.list;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    /*
    * 컬렉션 프레임워크는 크게 3가지
    * 인테페이스 중 한가지를 상속받아서 구현함
    * List, Set, Map
    *
    * List
    * - 순서가 존재함, 중복 저장을 허용
    * - Vector, ArrayList, LinkedList, Stack, Queur
    *
    * Set
    * - 순서가 없음, 중복을 허용하지 않음
    * - HaseSet, TreeSet
    *
    * Map
    * - key-value 쌍으로 이루어진 데이터 집합
    * - 순서가 존재하지 않음, 중복된 키 불가
    * - HashMap, TreeMap, HashTable, Properties
    * */

    // List는 가변적이고 요소의 추가 수정 삭제를 메서드로 제공해줌

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        List<Object> list = new ArrayList<>();
        list.add("Apple");
        list.add(100);
        list.add(45.67);
        list.add(LocalDateTime.now());

        System.out.println(list);

        System.out.println("list의 크기 : " + list.size());

        list.add(1,"banana");

        System.out.println(list);

        list.set(1, true);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        /*
        * LinkedList
        * - ArrayList와 달리 연속적으로 저장되어있지 않다.
        * - 저장한 요소가 순서를 유지하지 않고 저장됨.
        * - 요소들 사이를 링크로 연결하여 구성해 마치 연결된 리스트처럼 만듦
        * - 요소의 저장과 삭제가 빈번히 일어날 때 성능면에서 ArrayList보다 우수
        * */

        List<String> strList = new LinkedList<>();

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);
        Collections.reverse(strList);
        System.out.println(strList);

        /*
        * Iterator (반복자)
        * -> Collection 인터페이스의 iterator() 매서드를 이용해서 생성 가능
        * -> 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용
        *
        * */
        //strList
        Iterator<String> iterator = strList.iterator(); // Iterator 객체 생성

        /*
        * hasNext() -> 다음 요소가 있으면 true, 없으면 false를 반환
        * next() -> 현재 요소의 다음 요소로 이동시키고 그 요소를 반환
        * */

        while(iterator.hasNext()){
            String element  = iterator.next();
            System.out.println(element);
        }
    }
}
