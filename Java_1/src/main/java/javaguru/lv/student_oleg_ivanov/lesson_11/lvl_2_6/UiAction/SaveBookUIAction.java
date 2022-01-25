package javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.UiAction;
//task 31

import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.Book;
import javaguru.lv.student_oleg_ivanov.lesson_11.lvl_2_6.BookDatabase;
import javaguru.lv.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter author:");
        String bookAuthor = userInput.nextLine();
        System.out.println("Enter title:");
        String bookTitle = userInput.nextLine();
        Book book = new Book(bookAuthor, bookTitle);
        bookDatabase.save(book);

    }
}

