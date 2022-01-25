package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_2.task_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_6
@CodeReview(approved = true)
public class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int topSpeed) {
        super(2021);
        System.out.println("Top Speed = " + topSpeed);
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
