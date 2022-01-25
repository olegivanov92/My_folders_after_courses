package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;

//task 5
/*Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.
Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.*/
@CodeReview(approved = true)
public class ExceptionDemo extends Exception {

    Exception exception = new Exception();

    public ExceptionDemo(Exception exception) {
        this.exception = exception;
    }

    public ExceptionDemo(String message, Exception exception) {
        super(message);
        this.exception = exception;
    }

    public ExceptionDemo(String message, Throwable cause, Exception exception) {
        super(message, cause);
        this.exception = exception;
    }

    public ExceptionDemo(Throwable cause, Exception exception) {
        super(cause);
        this.exception = exception;
    }
}
