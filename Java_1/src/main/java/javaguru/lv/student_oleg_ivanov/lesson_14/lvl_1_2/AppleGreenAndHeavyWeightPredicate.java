package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task 11,12
@CodeReview(approved = true)
public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}

