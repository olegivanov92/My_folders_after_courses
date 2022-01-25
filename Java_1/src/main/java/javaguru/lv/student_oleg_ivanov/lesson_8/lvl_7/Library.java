package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Library {
   private String bookName;
   private int expirationDate;
   private double order;
   private boolean reservation;


    public Library(String bookName, int expirationDate, double order, boolean reservation) {
        this.bookName = bookName;
        this.expirationDate = expirationDate;
        this.order = order;
        this.reservation = reservation;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }

    public boolean isReservation() {
        return reservation;
    }

    public void setReservation(boolean reservation) {
        this.reservation = reservation;
    }

    void takeABook(){

    }

}
