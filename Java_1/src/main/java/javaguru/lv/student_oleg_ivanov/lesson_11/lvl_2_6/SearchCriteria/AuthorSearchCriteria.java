package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.teacher.annotations.CodeReview;

//task 16
@CodeReview(approved = true)
public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;


    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }


    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}


