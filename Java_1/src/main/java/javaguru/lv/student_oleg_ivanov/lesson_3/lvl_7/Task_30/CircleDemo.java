package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_30;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.14);
        myCircle.calculateArea(myCircle.getRadius());

    }
}
