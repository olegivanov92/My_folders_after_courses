package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task 32
@CodeReview(approved = true)
class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
