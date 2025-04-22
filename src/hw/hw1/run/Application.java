package hw.hw1.run;

import hw.hw1.model.dto.EmployeeDTO;
import hw.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] stu = new StudentDTO[3];
        stu[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        stu[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        stu[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        for(StudentDTO student : stu){
            System.out.println(student.imformation());
        }
        Scanner sc = new Scanner(System.in);
        EmployeeDTO[] emp = new EmployeeDTO[10];
        int count = 0;

        while (true) {
            if (count >= 10) {
                System.out.println("최대 인원(10명)을 초과했습니다.");
                break;
            }

            System.out.println("\n[" + (count + 1) + "번째 사원 입력]");

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("나이: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("키: ");
            double height = Double.parseDouble(sc.nextLine());

            System.out.print("몸무게: ");
            double weight = Double.parseDouble(sc.nextLine());

            System.out.print("연봉: ");
            int salary = Integer.parseInt(sc.nextLine());

            System.out.print("부서: ");
            String dept = sc.nextLine();

            emp[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 입력하시겠습니까? (y/n): ");
            String input = sc.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\n입력된 사원 목록:");
        for (int i = 0; i < count; i++) {
            System.out.println(emp[i].imformation());
        }

    }
}
