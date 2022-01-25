package student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabase;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BookDatabaseMock implements BookDatabase {

    private boolean isSaveTriggered = false;

    public boolean isSaveTriggered() {
        return isSaveTriggered;
    }

    @Override
    public Long save(Book book) {
        isSaveTriggered = true;
        return 1L;
    }

    @Override
    public boolean delete(Long bookId) {
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public int countAllBooks() {
        return 0;
    }

    @Override
    public void deleteByAuthor(String author) {

    }

    @Override
    public void deleteByTitle(String title) {

    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return null;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return null;
    }

    @Override
    public Set<String> findUniqueTitles() {
        return null;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return null;
    }

    @Override
    public Set<Book> findUniqueBooks(String author) {
        return null;
    }

    @Override
    public boolean contains(Book book) {
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return null;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return null;
    }
}
