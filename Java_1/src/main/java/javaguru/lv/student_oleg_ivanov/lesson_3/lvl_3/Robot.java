package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_3;

import javaguru.lv.teacher.annotations.CodeReview;

//Task_11
//Task_12
//Task_13
@CodeReview(approved = true)
public class Robot {
    public String name;

    void sayHello() {
        System.out.println("Hello!");

    }

    Robot(String name) {
        this.name = name;
    }


    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }


}
