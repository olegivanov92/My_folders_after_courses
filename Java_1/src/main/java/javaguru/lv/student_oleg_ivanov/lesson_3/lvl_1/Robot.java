package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_1;

import javaguru.lv.teacher.annotations.CodeReview;
import javaguru.lv.teacher.annotations.CodeReviewComment;

//task_1
//task_2
//task_5
@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо, только перепутали последовательность того, как в классе должны идти его структуры. Сначала" +
        "переменные" +
        "конструкторы" +
        "методы")
public class Robot {


    public Robot () {
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {

        System.out.println("My name is ROBO");

    }


}