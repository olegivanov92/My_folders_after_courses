package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task 8
@CodeReview(approved = true)
public class AppleRedColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return ("red".equals(apple.getColor()));
    }
}
