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

    //Getter and Setter
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() + " / 쿠폰 여부: " + (coupon ? "있음" : "없음");
    }
}
