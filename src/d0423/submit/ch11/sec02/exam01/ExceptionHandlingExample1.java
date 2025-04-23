package d0423.submit.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println("[예외 메시지] " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");

        printLength("ThisIsJava");
        printLength(null);

        System.out.println("[프로그램 종료]");
    }
}

/*
[프로그램 시작]

문자 수: 10
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
	at d0423.submit.ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:7)
	at d0423.submit.ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:15)
* */