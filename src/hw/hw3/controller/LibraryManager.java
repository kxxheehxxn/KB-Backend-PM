package hw.hw3.controller;

import hw.hw3.model.dto.Book;
import hw.hw3.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    public void insertMember(Member mem){

    }
    public Member myInfo(){
        return null;
    }
    public Book[] selectAll(){
        return new Book[0];
    }
    public Book[] searchBook(String keyword){
        return new Book[0];
    }
    public int rentBook(int index){
        return index;
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
