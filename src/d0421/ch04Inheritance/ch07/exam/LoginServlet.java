package d0421.ch04Inheritance.ch07.exam;

public class LoginServlet extends HTTPServlet {
    @Override
    public void service() {
        System.out.println("로그인 합니다.");
    }
}
