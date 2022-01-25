package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.SearchCriteria;

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest testRunner = new SearchCriteriaTest();
        testRunner.authorSearch();
        testRunner.authorSearchFail();
        testRunner.titleSearch();
        testRunner.titleSearchFail();
        testRunner.yearSearch();
        testRunner.yearSearchFail();
        testRunner.andSearchCriteria();
        testRunner.andSearchCriteriaFail();
        testRunner.orSearchCriteria();
        testRunner.orSearchCriteriaFail();
    }

    void authorSearch() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Пушкин");
        boolean actualResult = searchCriteria.match(new Book("Пушкин", "A1"));
        check(true, actualResult, "Author Search Test: ");

    }

    void authorSearchFail() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Пушкин");
        boolean actualResult = searchCriteria.match(new Book("Гоголь", "A1"));
        check(true, actualResult, "Author Search Fail Test: ");
        System.out.println();
    }

    void titleSearch() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("A2");
        boolean actualResult = searchCriteria.match(new Book("Пушкин", "A2"));
        check(true, actualResult, "Title Search Test: ");

    }

    void titleSearchFail() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("A2");
        boolean actualResult = searchCriteria.match(new Book("Пушкин", "A1"));
        check(true, actualResult, "Title Search Fail Test: ");
        System.out.println();
    }

    void yearSearch() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2010");
        boolean actualResult = searchCriteria.match(new Book("", "", "2010"));
        check(true, actualResult, "Year Search Test: ");

    }

    void yearSearchFail() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2010");
        boolean actualResult = searchCriteria.match(new Book("", "", "2011"));
        check(true, actualResult, "Year Search Fail Test: ");
        System.out.println();
    }

    void andSearchCriteria() {
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new TitleSearchCriteria("Война и Мир");
        SearchCriteria searchCriteria = new AndSearchCriteria(arg, arg1);
        boolean actualResult = searchCriteria.match(new Book("Л.Н.Толстой", "Война и Мир"));
        check(true, actualResult, "Search Criteria Test: ");

    }

    void andSearchCriteriaFail() {
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new TitleSearchCriteria("Война и Мир");
        SearchCriteria searchCriteria = new AndSearchCriteria(arg, arg1);
        boolean actualResult = searchCriteria.match(new Book("Пушкин", "Война и Мир"));
        check(true, actualResult, "Search Criteria Fail Test: ");
        System.out.println();
    }

    void orSearchCriteria() {
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new TitleSearchCriteria("Анна Каренина");
        SearchCriteria searchCriteria = new OrSearchCriteria(arg, arg1);
        boolean actualResult = searchCriteria.match(new Book("Л.Н.Толстой", "Война и Мир"));
        check(true, actualResult, "Or Criteria Test: ");

    }

    void orSearchCriteriaFail() {
        SearchCriteria arg = new AuthorSearchCriteria("Л.Н.Толстой");
        SearchCriteria arg1 = new TitleSearchCriteria("Анна Каренина");
        SearchCriteria searchCriteria = new OrSearchCriteria(arg, arg1);
        boolean actualResult = searchCriteria.match(new Book("Пушкин", "Война и Мир"));
        check(true, actualResult, "Or Criteria Fail Test: ");

    }


    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
            System.out.println("Expected result: " + expectedResult + " but actual is: " + actualResult);
        }
    }

}
