package d0421.ch04Inheritance.ch07.exam;

public class HTTPServletExample {
    public static void main(String[] args) {
        method(new LoginServlet()); // 로그인 합니다.
        method(new FileDownloadServlet()); // 파일 다운로드합니다.
    }

    public static void method(HTTPServlet httpServlet) {
        httpServlet.service();
    }
}
