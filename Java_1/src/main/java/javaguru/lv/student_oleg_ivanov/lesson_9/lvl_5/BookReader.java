package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_5;
//task 12-24

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.List;

@CodeReview(approved = true)
public interface BookReader {

    boolean addBook(Book newBook);

    boolean delete(Book book);

    Book[] allBooks();

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    boolean finishedBooks(Book book);

    boolean notFinishedBooks(Book book);

    List<Book> allFinishedBooks();

    List<Book> allNotFinishedBooks();

}
