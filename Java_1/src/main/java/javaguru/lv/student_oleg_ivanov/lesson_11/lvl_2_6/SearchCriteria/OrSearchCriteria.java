package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.teacher.annotations.CodeReview;

//task 20
@CodeReview(approved = true)
public class OrSearchCriteria implements SearchCriteria {
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

    @Override
    public String toString() {
        return "OrSearchCriteria{" +
                "leftCondition=" + leftCondition +
                ", rightCondition=" + rightCondition +
                '}';
    }
}
