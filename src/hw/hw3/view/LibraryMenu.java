package hw.hw3.view;

import hw.hw3.controller.LibraryManager;
import hw.hw3.model.dto.*;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별(M/F) : ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: System.out.println(lm.myInfo()); break;
                case 2: selectAll(); break;
                case 3: searchBook(); break;
                case 4: rentBook(); break;
                case 0: System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("잘못 입력했습니다. 다시 선택해주세요.");
            }
        }
    }

    public void selectAll() {
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 제목 키워드 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);

        for (Book b : searchList) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    public void rentBook() {
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();

        int result = lm.rentBook(index);

        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }
}