package d0430.ch10Collection.ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();
        queue.add(new Message("sendMail", "홍길동"));
        queue.add(new Message("sendSMS", "신용권"));
        queue.add(new Message("sendKakaotalk", "감자바"));

        while (!queue.isEmpty()) {
            Message msg = queue.poll();
            if (msg.command.equals("sendMail")) {
                System.out.println(msg.to + "에게 메일을 보냅니다.");
            }
            if (msg.command.equals("sendSMS")) {
                System.out.println(msg.to + "에게 SMS를 보냅니다.");
            }
            if (msg.command.equals("sendKakaotalk")) {
                System.out.println(msg.to + "에게 카카오톡을 보냅니다.");
            }
        }
    }
}
