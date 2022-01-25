package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.*;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
@CodeReview(approved = true)
public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest testRunner = new BookDatabaseTest();
        testRunner.save();
        testRunner.deleteById();
        testRunner.deleteByIdFail();
        testRunner.deleteByObject();
        testRunner.deleteByObjectFail();
        testRunner.optionalSearch();
        testRunner.findByAuthor();
        testRunner.findByAuthorFAil();
        testRunner.countAllBooks();
        testRunner.countAllBooksFail();
        testRunner.deleteByAuthor();
        testRunner.deleteByAuthorFail();
        testRunner.deleteByTitle();
        testRunner.deleteByTitleFail();
        testRunner.findAndSearchCriteria();
        testRunner.findAndSearchCriteriaFail();
        testRunner.findOrSearchCriteria();
        testRunner.findOrSearchCriteriaFail();
        testRunner.findUniqueAuthors();
        testRunner.findUniqueTitles();
        testRunner.findUniqueBooks();
        testRunner.bookContains();
        testRunner.bookContainsFail();
        testRunner.getAuthorToBooksMap();
        testRunner.getEachAuthorBookCount();
    }


    void save() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        int expectedResult = 7;
        long actualResult = bookDatabase.save(new Book("Достоевский", "Идиот"));
        check(expectedResult, actualResult, "Save Test: ");
        System.out.println();
    }


    void deleteById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book testBook = new Book("Пушкин", "Сказка о рыбаке и рыбке");
        Long savedId = bookDatabase.save(testBook);
        boolean actualResult = bookDatabase.delete(savedId);
        check(true, actualResult, "Delete by ID Test: ");

    }

    void deleteByIdFail() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        boolean actualResult = bookDatabase.delete(8L);
        check(true, actualResult, "Delete by ID Fail Test: ");
        System.out.println();
    }

    void deleteByObject() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book testBook = new Book("Л.Н.Толстой", "Война и Мир");
       Long book = bookDatabase.save(testBook);
        boolean actualResult = bookDatabase.delete(book);
        check(true, actualResult, "Delete by Object Test: ");
    }

    void deleteByObjectFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book testBook = new Book("Л.Н.Толстой", "Анна Каренина");
        Long book = bookDatabase.save(testBook);
        boolean actualResult = bookDatabase.delete(book);
        check(true, !actualResult, "Delete by Object Negative Test: ");
        System.out.println();
    }

    void optionalSearch() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book testBook = new Book("Пушкин", "Сказка о рыбаке и рыбке");
        Long savedId = bookDatabase.save(testBook);
        Optional<Book> actualResult = bookDatabase.findById(savedId);
        if (actualResult.isPresent()) {
            Book result = actualResult.get();
            check(testBook.equals(result), "Optional search Test: ");
        } else {
            check(false, "Optional search Test: ");
        }
        System.out.println();
    }

    void findByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        List<Book> actualResult = bookDatabase.findByAuthor("Анджей Сапковский");
        if (actualResult != null)
            System.out.println("Find by Author Test OK: " + actualResult);

    }

    void findByAuthorFAil() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        List<Book> actualResult = bookDatabase.findByAuthor("Сьюзенн Коллинз");
        if (actualResult == null)
            System.out.println("Find by Author Test OK: ");
        else System.out.println("Find by Author Test Fail is Empty " + actualResult);
        System.out.println();
    }

    void countAllBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 3;
        check(expectedResult, actualResult, "All Books Count Test: ");


    }

    void countAllBooksFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 2;
        check(expectedResult, actualResult, "All Books Count Fail Test: ");
        System.out.println();

    }


    void deleteByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.deleteByAuthor("Л.Н.Толстой");
        bookDatabase.countAllBooks();
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 2;
        check(expectedResult, actualResult, "Delete by Author Test: ");

    }

    void deleteByAuthorFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.deleteByAuthor("Л.Н.Толстой");
        bookDatabase.countAllBooks();
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 1;
        check(expectedResult, actualResult, "Delete by Author Fail Test: ");
        System.out.println();
    }

    void deleteByTitle() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.deleteByTitle("Война и Мир");
        bookDatabase.countAllBooks();
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 3;
        check(expectedResult, actualResult, "Delete by Title Test: ");


    }

    void deleteByTitleFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.deleteByTitle("Война и Мир");
        bookDatabase.countAllBooks();
        int actualResult = bookDatabase.countAllBooks();
        int expectedResult = 4;
        check(expectedResult, actualResult, "Delete by Title Fail Test: ");
        System.out.println();
    }

    void findAndSearchCriteria() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new YearOfIssueSearchCriteria("1860");
        bookDatabase.find(new AndSearchCriteria(arg, arg1));
        List<Book> actualResult = bookDatabase.find(new AndSearchCriteria(arg, arg1));
        if (actualResult == null)
            System.out.println("Find AndSearch Test Fail: ");
        else System.out.println("Find AndSearch Test OK: " + actualResult);

    }

    void findAndSearchCriteriaFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new YearOfIssueSearchCriteria("1861");
        List<Book> actualResult = bookDatabase.find(new AndSearchCriteria(arg, arg1));
        if (actualResult == null)
            System.out.println("Find AndSearch FailTest Fail: ");
        else System.out.println("Test Fail: Cannot Find a Book" + actualResult);
        System.out.println();
    }

    void findOrSearchCriteria() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new YearOfIssueSearchCriteria("");
        List<Book> actualResult = bookDatabase.find(new OrSearchCriteria(arg, arg1));
        if (actualResult == null)
            System.out.println("Find orSearch Test Fail: ");
        else System.out.println("Find orSearch Test OK: " + actualResult);

    }

    void findOrSearchCriteriaFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        SearchCriteria arg = new AuthorSearchCriteria(null);
        SearchCriteria arg1 = new YearOfIssueSearchCriteria(null);
        List<Book> actualResult = bookDatabase.find(new OrSearchCriteria(arg, arg1));
        if (actualResult == null)
            System.out.println("Find orSearch FailTest OK: ");
        else System.out.println("Test Fail: Cannot Find a Book" + actualResult);
        System.out.println();
    }

    void findUniqueAuthors() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        Set<String> actualResult = bookDatabase.findUniqueAuthors();
        if (actualResult != null)
            System.out.println("Unique authors finding: " + actualResult);

    }

    void findUniqueTitles() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Джордж Р. Р. Мартин", "Игра Престолов"));
        bookDatabase.save(new Book("Сьюзен Коллинз", "Голодные Игры"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир"));
        bookDatabase.save(new Book("Анджей Сапковский", "Ведьмак"));
        Set<String> actualResult = bookDatabase.findUniqueTitles();
        if (actualResult != null)
            System.out.println("Unique titles finding: " + actualResult);

    }

    void findUniqueBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        Set<Book> actualResult = bookDatabase.findUniqueBooks();
        if (actualResult != null)
            System.out.println("Unique books finding: " + actualResult);
        System.out.println();
    }

    void bookContains() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        boolean actualResult = bookDatabase.contains(new Book("Пушкин", "Руслан и Людмила ","1817"));
        check(true, actualResult, "Book contains test: ");

    }

    void bookContainsFail() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        bookDatabase.save(new Book("Пушкин", "Руслан и Людмила ","1817"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Достоевский", "Идиот","1868"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        boolean actualResult = bookDatabase.contains(new Book("Пушкин", "Руслан и Людмила ","1810"));
        check(true, actualResult, "Book contains Fail test: ");
        System.out.println();

    }

    void getAuthorToBooksMap() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Анджей Сапковский", "Последнее желание","1990"));
        bookDatabase.save(new Book("Анджей Сапковский", "Меч предназначения","1992"));
        bookDatabase.save(new Book("Анджей Сапковский", "Кровь эльфов","1994"));
        bookDatabase.save(new Book("Анджей Сапковский", "Час призрения","1995"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        Map<String, List<Book>> actualResult = bookDatabase.getAuthorToBooksMap();
        System.out.println("Get Author To Books Map Test: " + actualResult);

    }

    void getEachAuthorBookCount() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("Анджей Сапковский", "Последнее желание","1990"));
        bookDatabase.save(new Book("Анджей Сапковский", "Меч предназначения","1992"));
        bookDatabase.save(new Book("Анджей Сапковский", "Кровь эльфов","1994"));
        bookDatabase.save(new Book("Анджей Сапковский", "Час призрения","1995"));
        bookDatabase.save(new Book("Анджей Сапковский", "Час призрения","1995"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Война и Мир","1860"));
        bookDatabase.save(new Book("Л.Н.Толстой", "Анна Каренина","1873"));
        Map<String, Integer> actualResult = bookDatabase.getEachAuthorBookCount();
        System.out.println("Get Author Count Map Test: " + actualResult);
    }


    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public void check(boolean expectedResult, List<Book> actualResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println();
        }
    }

    public void check(boolean value, String testName) {
        if (value) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println();
        }
    }

    public static void check(int expectedResult, long actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public static void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}