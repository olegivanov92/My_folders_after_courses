package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {
    public String detect(int number) {
        if (dividedBy3(number) && dividedBy5(number)){
            return "FizzBuzz";
        }
        if (dividedBy3(number)) {
            return "Fizz";
        }
        if (dividedBy5(number)) {
            return "Buzz";
        }

        else return "" + number;

    }

    private boolean dividedBy3(int number) {
        return number % 3 == 0;
    }
    private boolean dividedBy5(int number) {
        return number % 5 == 0;
    }
}