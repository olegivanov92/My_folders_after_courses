package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task 32
@CodeReview(approved = true)
public class Division extends TwoArgumentMathOperation {
    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }


    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();

    }
}
