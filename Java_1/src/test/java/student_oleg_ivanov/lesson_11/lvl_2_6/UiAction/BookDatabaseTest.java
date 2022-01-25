package student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabaseImpl;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.PagingSearchCriteria;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria.SearchCriteria;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookDatabaseTest {

    BookDatabaseImpl victim;

    @Before
    public void setUp() {
        victim = new BookDatabaseImpl();
        initBooks(victim);
    }

    private void initBooks(BookDatabaseImpl victim) {
        for (int i = 0; i < 100; i++) {
            victim.save(new Book(String.valueOf(i), "Title if" + i));
        }
    }

    @Test
    public void findBooksWithPaging10() {
        SearchCriteria searchCriteria = new PagingSearchCriteria(10);
        List<Book> resultBooks = victim.find(searchCriteria);
        assertEquals(10, resultBooks.size());
    }
}
