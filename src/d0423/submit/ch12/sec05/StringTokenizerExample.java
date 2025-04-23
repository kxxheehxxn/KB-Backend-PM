package d0423.submit.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String data2 = "홍길동/이수홍/박연수";

        StringTokenizer st1 = new StringTokenizer(data1, "&,");
        while (st1.hasMoreTokens()) {
            String token = st1.nextToken();
            System.out.println(token);
        }

        System.out.println("----------------------");
        StringTokenizer st2 = new StringTokenizer(data2, "/");
        while (st2.hasMoreTokens()) {
            String token = st2.nextToken();
            System.out.println(token);
        }
    }
}