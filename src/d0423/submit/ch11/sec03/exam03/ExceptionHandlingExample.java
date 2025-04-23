package d0423.submit.ch11.sec03.exam03;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};

        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 : 배열 초과");
        } catch (NullPointerException e) {
            System.out.println("예외 : 널포인터");
        } catch (NumberFormatException e) {
            System.out.println("예외 : 숫자 형식 오류");
        }

    }

}

