package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_1;

//task 1 = public class MyException extends Throwable

//task 2 = public class MyException extends Throwable

//task 3 = public class MyException extends Exception
//task 3 = public class MyException extends RuntimeException
//task 3 = public class MyException extends Throwable

import javaguru.lv.teacher.annotations.CodeReview;

//task 4
@CodeReview(approved = true)
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
