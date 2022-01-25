package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_33;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
