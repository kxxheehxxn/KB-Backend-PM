package hw.hw3.model.dto;

public class CookBook extends Book{
    private boolean coupon;

    //Constructor
    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString(){
        return "";
    }
    //Getter and Setter
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
