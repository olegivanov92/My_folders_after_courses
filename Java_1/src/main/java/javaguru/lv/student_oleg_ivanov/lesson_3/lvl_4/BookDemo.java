package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task14
@CodeReview(approved = true)
public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
