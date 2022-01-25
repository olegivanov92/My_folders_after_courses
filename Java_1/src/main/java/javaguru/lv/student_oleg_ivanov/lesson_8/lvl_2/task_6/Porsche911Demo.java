package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_2.task_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_6
@CodeReview(approved = true)
public class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911(300);
        System.out.println("Release Year = " + porsche911.getReleaseYear());
    }
}
