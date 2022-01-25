package javaguru.lv.student_oleg_ivanov.lesson_9.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.List;

@CodeReview(approved = true)
public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest testRunner = new BookReaderTest();
        testRunner.addBookTest();
        testRunner.addBookTestFail();
        testRunner.addBookEmptyAuthor();
        testRunner.delete();
        testRunner.deleteFail();
        testRunner.allBooks();
        testRunner.findByAuthor();
        testRunner.findByAuthorFirstChars();
        testRunner.findByTitle();
        testRunner.findByTitleFirstChars();
        testRunner.finishedBooks();
        testRunner.notFinishedBooks();
        testRunner.allFinishedBooks();
        testRunner.allNotFinishedBooks();
    }

    void addBookTest() {
        BookReaderImpl myBook = new BookReaderImpl();
        boolean actualResult = myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        check(true, actualResult, "Book add Test: " + actualResult);

    }

    void addBookTestFail() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        boolean actualResult = myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        check(false, actualResult, "Book add FailTest: " + actualResult);

    }

    void addBookEmptyAuthor() {
        BookReaderImpl myBook = new BookReaderImpl();
        boolean actualResult = myBook.addBook(new Book("", "Анна Каренина"));
        check(false, actualResult, "Add Book with empty author: " + actualResult);

    }

    void delete() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        boolean actualResult = myBook.delete(new Book("Пушкин", "Руслан и Людмила "));
        check(true, actualResult, "Delete book Test: ");
    }

    void deleteFail() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        boolean actualResult = myBook.delete(new Book("Пушкин", "Валера и Людмила "));
        check(false, actualResult, "Delete book FailTest: ");
    }

    void allBooks() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        Book[] actualResult = myBook.allBooks();
        System.out.println(Arrays.toString(actualResult));
    }

    void findByAuthor() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        List<Book> actualResult = myBook.findByAuthor("Джордж Р. Р. Мартин");
        if (!actualResult.isEmpty())
            System.out.println("Find by author Test: OK");
        else System.out.println("Find by author Test: Fail");
    }

    void findByAuthorFirstChars() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        List<Book> actualResult = myBook.findByAuthor("Джо");
        if (!actualResult.isEmpty())
            System.out.println("Find by First Chars Author Test: OK");
        else System.out.println("Find by First Chars Test: Fail");
    }

    void findByTitle() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        List<Book> actualResult = myBook.findByTitle("Игра Престолов");
        if (!actualResult.isEmpty())
            System.out.println("Find by title Test: OK");
        else System.out.println("Find by title Test: Fail");
    }

    void findByTitleFirstChars() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        List<Book> actualResult = myBook.findByTitle("Игр");
        if (!actualResult.isEmpty())
            System.out.println("Find by title first chars Test: OK");
        else System.out.println("Find by title first chars Test: Fail");
    }

    void finishedBooks() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        boolean result = myBook.finishedBooks(new Book("Л.Н.Толстой", "Анна Каренина"));
        check(true, result, "Finished books" + myBook);


    }


    void notFinishedBooks() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        boolean result = myBook.notFinishedBooks(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        check(true, result, "Not finished books" + myBook);

    }

    void allFinishedBooks() {
        BookReaderImpl myBook = new BookReaderImpl();
        myBook.addBook(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.addBook(new Book("Пушкин", "Руслан и Людмила "));
        myBook.finishedBooks(new Book("Л.Н.Толстой", "Анна Каренина"));
        myBook.finishedBooks(new Book("Пушкин", "Руслан и Людмила "));
        List<Book> result = myBook.allFinishedBooks();
        System.out.println(result);
        if (result.isEmpty())
            System.out.println("All finished books Test: Fail");
        else System.out.println("All finished books Test: OK");


    }

    //task 24
    void allNotFinishedBooks() {
        BookReaderImpl myBook = new BookReaderImpl();

        myBook.addBook(new Book("Сьюзен Коллинз", "Голодные Игры"));
        myBook.addBook(new Book("Анджей Сапковский", "Ведьмак"));
        myBook.addBook(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.finishedBooks(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        myBook.notFinishedBooks(new Book("Сьюзен Коллинз", "Голодные Игры"));
        myBook.notFinishedBooks(new Book("Анджей Сапковский", "Ведьмак"));
        List<Book> result = myBook.allNotFinishedBooks();
        System.out.println(result);
        if (result.isEmpty())
            System.out.println("All not finished books Test: Fail");
        else System.out.println("All not finished books Test: OK");
    }

    public void check(boolean value, boolean actualResult, String testName) {
        if (value == actualResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void check(boolean value, String testName) {
        if (value) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
