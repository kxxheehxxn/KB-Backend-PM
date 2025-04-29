package d0429.ch09GenericCollection.advanced.ch15.sec02.exam01;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();
        Board board1 = new Board();
        Board board2 = new Board();
        Board board3 = new Board();
        Board board4 = new Board();
        Board board5 = new Board();
        list.add(board1);
        list.add(board2);
        list.add(board3);
        list.add(board4);
        list.add(board5);
        System.out.println(list.size());

        System.out.println(list.get(3));
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        list.remove(2);
        for(Board b : list){
            System.out.println(b);
        }
    }
}
