package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_4;

import javaguru.lv.teacher.annotations.CodeReview;

//task15
@CodeReview(approved = true)
public class Phone {
    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
