package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.teacher.annotations.CodeReview;

//task 21
@CodeReview(approved = true)
public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(new Book("Kuper","Zveroboi")));

        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria1 = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria1, titleSearchCriteria1);
        System.out.println(searchCriteria1.match(new Book("1890","Kuper","Zveroboi")));

        SearchCriteria authorSearchCriteria2 = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria2 = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria2 = new OrSearchCriteria(authorSearchCriteria2, titleSearchCriteria2);
        System.out.println(searchCriteria2.match(new Book("","Kuper","")));

    }

}