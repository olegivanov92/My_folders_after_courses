package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;
//task 32

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabase;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter id(book) number ");
        Optional<Book> bookOpt = bookDatabase.findById(userInput.nextLong());
        System.out.println(bookOpt);


    }
}
