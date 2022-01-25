package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_14;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ElectricCar extends Car {
    public int batteryCharge;

    ElectricCar(int batteryCharge){
        this.batteryCharge=batteryCharge;
    }


    @Override
    void accelerate() {
        System.out.println("Silent accelerate");

    }
}
