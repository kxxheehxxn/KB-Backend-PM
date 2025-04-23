package hw.hw3.model.dto;

public class AniBook extends Book {
    private int accessAge;

    //Constructor
    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    //Getter and Setter
    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + " / 제한 나이: " + accessAge;
    }
}
