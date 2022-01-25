package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;

public class PagingSearchCriteria implements SearchCriteria {

    private Integer paging;

    public PagingSearchCriteria(Integer paging) {
        this.paging = paging;
    }

    @Override
    public boolean match(Book book) {
        return book.getId() <= paging;
    }
}
