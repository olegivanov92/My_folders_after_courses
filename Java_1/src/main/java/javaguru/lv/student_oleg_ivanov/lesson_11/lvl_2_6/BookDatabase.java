package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.SearchCriteria;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@CodeReview(approved = true)
public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    Set<Book> findUniqueBooks(String author);

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}
