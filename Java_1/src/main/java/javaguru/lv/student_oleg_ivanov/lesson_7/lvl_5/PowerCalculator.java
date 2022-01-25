package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_5;

import javaguru.lv.teacher.annotations.CodeReview;

//Task_9
@CodeReview(approved = true)
public class PowerCalculator {

    public int exponentiation(int number, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;

    }
}
