package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_14;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar(50.0);
        ElectricCar electricCar = new ElectricCar(100);
        petrolCar.accelerate();
        electricCar.accelerate();
    }
}
