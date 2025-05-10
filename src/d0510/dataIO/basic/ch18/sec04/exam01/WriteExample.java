package d0510.dataIO.basic.ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    /*
    * Writer
    * - 문자 기반 출력 스트림의 최상위 추상클래스
    * - 2바이트 단위로 처리
    * - FileWriter, InputStreamWriter 등을 사용
    * */
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("test.txt")){
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);
            char[] arr = {'C','D','E', '\n','A'};
            writer.write(arr);

            //안써도 close() 호출될 때 자동으로 호출됨
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
