import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x값 입력: ");
        int x = sc.nextInt();
        System.out.print("y값 입력: ");
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("x+y:" + result);

        while(true){
            System.out.print("입력 문자열");
            String inString = sc.nextLine();
            if(inString.equals("q") ){
                sc.close();
                break;
            }
            System.out.print("출력 문자열");
            System.out.println(inString);
        }
    }
}
