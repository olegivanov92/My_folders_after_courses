package javaguru.lv.student_oleg_ivanov.lesson_8.lvl_3.task_14;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class PetrolCar extends Car {
    public double petrolTankCapacity;

     PetrolCar(double petrolTankCapacity){
        this.petrolTankCapacity=petrolTankCapacity;
    }

    @Override
    void accelerate() {
        System.out.println("Brum brum accelerate");

    }


}
