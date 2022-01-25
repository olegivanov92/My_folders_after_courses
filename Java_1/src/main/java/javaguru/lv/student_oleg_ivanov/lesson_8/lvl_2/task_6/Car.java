package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_2.task_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_6
@CodeReview(approved = true)
public class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
