package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task 32
@CodeReview(approved = true)
class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
