package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.teacher.annotations.CodeReview;

//task 15
@CodeReview(approved = true)
public interface SearchCriteria {
    boolean match(Book book);
}
