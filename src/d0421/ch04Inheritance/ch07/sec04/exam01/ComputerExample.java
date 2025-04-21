package d0421.ch04Inheritance.ch07.sec04.exam01;

import java.util.Scanner;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Computer o = new Computer();
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(c.areaCircle(a));
        System.out.println(o.areaCircle(a));
    }


}
