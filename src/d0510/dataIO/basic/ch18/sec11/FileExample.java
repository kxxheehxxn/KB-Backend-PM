package d0510.dataIO.basic.ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("파일 경로: " + file.getPath());
                System.out.println("파일 크기: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                System.out.println("<dir> " + file.getPath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
