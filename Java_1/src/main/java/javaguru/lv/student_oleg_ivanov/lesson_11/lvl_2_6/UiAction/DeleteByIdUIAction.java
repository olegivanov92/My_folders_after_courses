package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;
//task 35

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabase;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter book id to Delete");
        boolean delete = bookDatabase.delete(userInput.nextLong());
        System.out.println("Delete a book " + delete);

    }
}
