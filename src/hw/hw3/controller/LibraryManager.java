package hw.hw3.controller;

import hw.hw3.model.dto.*;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem){
        this.mem = mem;
    }
    public Member myInfo(){
        return mem;
    }
    public Book[] selectAll(){
        return bList;
    }
    public Book[] searchBook(String keyword){
        Book[] searchList = new Book[5];
        int count = 0;
        for(Book book : bList){
            if(book.getTitle().contains(keyword)){
                searchList[count++] = book;
            }
        }
        return searchList;
    }
    public int rentBook(int index) {
        int result = 0;
        Book book = bList[index];

        if (book instanceof AniBook) {
            AniBook ani = (AniBook) book;
            if (mem.getAge() < ani.getAccessAge()) {
                result = 1;
            }
        } else if (book instanceof CookBook) {
            CookBook cook = (CookBook) book;
            if (cook.isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }

        return result;
    }

    //Getter and Setter
    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }
}
