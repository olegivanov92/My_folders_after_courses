package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;
//task 34
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabase;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

        public FindByTitleUIAction(BookDatabase bookDatabase) {
            this.bookDatabase = bookDatabase;
        }

    @Override
    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter title name ");
        List<Book> title = bookDatabase.findByTitle(userInput.nextLine());
        System.out.println(title);

    }
}
