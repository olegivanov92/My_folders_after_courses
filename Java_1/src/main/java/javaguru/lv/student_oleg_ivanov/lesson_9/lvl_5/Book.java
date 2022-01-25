package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
public class Book {
    private String title;
    private String author;
    private boolean finishedBooks;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setFinishedBooks(boolean finishedBooks) {
        this.finishedBooks = finishedBooks;
    }

    public boolean isFinishedBooks() {
        return finishedBooks;
    }

    @Override
    public String toString() {
        return
                title +
                        "[" + author + "]";

    }


}
