package d0416.ch03Class.lecture.book;

public class Application {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.pageCount = 320;
        myBook.title = "해리포터와 마법사의 돌";
        myBook.author = "조앤 K 롤링";
        myBook.coverType = "하드커버";

        Book myBook2 = new Book();
        myBook2.title = "해리포터와 혼혈왕자";
        myBook2.author = "조앤 K 롤링";
        myBook2.coverType = "하드커버";
        myBook2.pageCount = 320;

        Book myBook3 = new Book("조앤 K 롤링", "해리포터와 불사조 기사단", "하드타입", 330 );


        myBook.getTitle();
        myBook2.getTitle();
        System.out.println(myBook2.toString());
        System.out.println(myBook3.toString());
    }
}
