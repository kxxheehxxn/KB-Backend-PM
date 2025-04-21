package d0421.ch04Inheritance.ch07.exam;

public class FileDownloadServlet extends HTTPServlet {
    @Override
    public void service() {
        System.out.println("파일 다운도르 합니다.");
    }
}
