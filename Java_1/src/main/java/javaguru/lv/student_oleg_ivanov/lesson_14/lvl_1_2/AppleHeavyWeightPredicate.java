package javaguru.lv.student_oleg_ivanov.lesson_14.lvl_1_2;

import javaguru.lv.teacher.annotations.CodeReview;

//task 8
@CodeReview(approved = true)
public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
