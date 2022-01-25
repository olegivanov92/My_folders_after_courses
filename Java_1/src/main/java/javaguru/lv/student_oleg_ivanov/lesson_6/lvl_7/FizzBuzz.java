package javaguru.lv.student_oleg_ivanov.lesson_6.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task_32
@CodeReview(approved = true)
public class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }
}
