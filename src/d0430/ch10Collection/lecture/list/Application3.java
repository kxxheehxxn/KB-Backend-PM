package d0430.ch10Collection.lecture.list;

import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Queue
        * - 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO) 방식의 자료구조
        * - 자체가 인터페이스이기 때문에 인스턴스 생성이 불가
        * */
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println("queue" + queue);

        /*
        * peek() : 해당 큐에 가장 앞에 있는 요소 반환
        * poll() : 요소 반환 후 제거
        * */

        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
