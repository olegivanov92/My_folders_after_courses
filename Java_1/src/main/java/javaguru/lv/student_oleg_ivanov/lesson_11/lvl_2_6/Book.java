package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Objects;

@CodeReview(approved = true)
public class Book {
    private Long id;
    private String author;
    private String title;
    private String yearOfIssue;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }


    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title) && yearOfIssue.equals(book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfIssue);
    }
    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return  title.equals(book.title) && author.equals(book.author) && yearOfIssue.equals(book.yearOfIssue);
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, author, yearOfIssue);
//    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }
}
