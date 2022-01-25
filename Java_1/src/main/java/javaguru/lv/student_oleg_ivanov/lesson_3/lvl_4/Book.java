package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task14
@CodeReview(approved = true)
public class Book {
    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }
}
