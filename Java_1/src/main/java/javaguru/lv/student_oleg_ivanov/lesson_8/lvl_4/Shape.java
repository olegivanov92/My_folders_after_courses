package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15...19
@CodeReview(approved = true)
abstract public class Shape {
    public String title;

    public Shape(String title) {
        this.title = title;


    }

    public abstract  double calculateArea();

    public abstract  double calculatePerimeter();

}

