package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;

@CodeReview(approved = true)
public class BookReaderImpl implements BookReader {
    List<Book> library = new ArrayList<>();

    //task 13-14
    @Override
    public boolean addBook(Book newBook) {
        if (inLibrary(newBook) || authorAndTitleEmpty(newBook)) {
            return false;
        }
        library.add(newBook);
        return true;
    }

    //task 15
    @Override
    public boolean delete(Book book) {
        if (inLibrary(book)) {
            library.remove(book);
            return true;
        }
        return false;
    }

    //task 16
    @Override
    public Book[] allBooks() {
        Book[] arr = new Book[library.size()];
        library.toArray(arr);

        return arr;
    }

    //task 17-18
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author) || book.getAuthor().contains(author)) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }


    //task 19-20
    @Override
    public List<Book> findByTitle(String title) {
        List<Book> resultBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().equals(title) || book.getTitle().contains(title)) {
                resultBooks.add(book);
            }
        }
        return resultBooks;
    }

    //task 21
    @Override
    public boolean finishedBooks(Book book) {
        for (Book book1 : library) {
            if (book.equals(book1)) {
                book1.setFinishedBooks(true);
                return true;
            }
        }
        return false;
    }

    //task 22
    @Override
    public boolean notFinishedBooks(Book book) {
        for (Book book1 : library) {
            if (book.equals(book1)) {
                book1.setFinishedBooks(false);
                return true;
            }
        }
        return false;
    }

    //task 23
    @Override
    public List<Book> allFinishedBooks() {
        List<Book> finishedBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.isFinishedBooks()) {
                finishedBooks.add(book);
            }
        }
        return finishedBooks;
    }

    //task 24
    @Override
    public List<Book> allNotFinishedBooks() {
        List<Book> notFinishedBooks = new ArrayList<>();
        for (Book book : library) {
            if (!book.isFinishedBooks()) {
                notFinishedBooks.add(book);
            }
        }
        return notFinishedBooks;
    }


    public boolean inLibrary(Book newBook) {
        for (Book book : library) {
            if (newBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public boolean authorAndTitleEmpty(Book newBook) {
        return "".equals(newBook.getAuthor()) || "".equals(newBook.getTitle());
    }

    @Override
    public String toString() {
        return library.toString();
    }
}









