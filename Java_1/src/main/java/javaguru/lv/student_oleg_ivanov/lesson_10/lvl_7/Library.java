package javaguru.lv.student_oleg_ivanov.lesson_10.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task 35
@CodeReview(approved = true)
public class Library {

    private String bookName;
    private String authorName;
    private int price;
    private int quantity;;
    private boolean reservation;

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isReservation() {
        return reservation;
    }

    public static class Builder {
        private Library newLibrary;

        public Builder() {
            newLibrary = new Library();
        }

        public Builder withName(String bookName) {
            newLibrary.bookName = bookName;
            return this;
        }

        public Builder withSurname(String authorName) {
            newLibrary.authorName = authorName;
            return this;
        }

        public Builder withAge(int price) {
            newLibrary.price = price;
            return this;
        }

        public Builder withHeight(int quantity) {
            newLibrary.quantity = quantity;
            return this;
        }

        public Builder withWeight( boolean reservation) {
            newLibrary.reservation = reservation;
            return this;
        }


        public Library build() {
            return newLibrary;
        }

    }

    @Override
    public String toString() {
        return "Library{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", reservation=" + reservation +
                '}';
    }

    public static void main(String[] args) {
        Library myLibrary = new Builder()
                .withName("Game of Thrones")
                .withSurname("George Raymond Richard Martin")
                .withAge(30)
                .withHeight(5)
                .withWeight(true)
                .build();
        System.out.println(myLibrary);

    }
}

